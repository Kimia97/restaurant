package pakke; /**
 * Created by Kimia on 20.09.2017.
 */



import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Path("/order/")
public class OrderService {
    private static ArrayList<Order> orders = new ArrayList<>(4);
    private static final AtomicInteger count = new AtomicInteger(0);
    private static ArrayList<Table> tables = new ArrayList<>(3);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addOrder(Order order) {

        int customerid = count.incrementAndGet();
        int tablenr = count.incrementAndGet();
        order.setCustomerid(customerid);
        System.out.println("tablenr: " + tablenr);
        order.setTablenr(tablenr);
        String appetizer = order.getAppetizer();
        String maincourse = order.getMainCourse();
        String dessert = order.getDessert();
        int numfood = 0;
        if(!(appetizer.equals("None"))){
            numfood++;
        }
        if (!(maincourse.equals("None"))){
            numfood++;
        }
        if(!(dessert.equals("None"))){
            numfood++;
        }
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss a");
            Date date2 = formatter.parse(order.getFromTime()+":00 AM");
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(date2);
            cal2.add(Calendar.MINUTE, numfood*30);
            SimpleDateFormat printTimeFormat = new SimpleDateFormat("HH:mm a");
            order.setToTime(printTimeFormat.format(cal2.getTime()));

        } catch (Exception e){
            e.printStackTrace();

        }
        for(int i = 0; i<tables.size();i++){
            if(tables.get(i).checkOrder(order)) {
                orders.add(order);
            }
        }

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> getOrders() { return orders;}

    @DELETE
    @Path("/{customerid}")
    public void deleteOrder(@PathParam("customerid") int customerid) {
        for(int i = 0; i<orders.size();i++){
            if(customerid == orders.get(i).getCustomerid()){
                orders.remove(i);
            } else {
                System.out.println("This customerid does not exist");
            }
        }
    }

}
