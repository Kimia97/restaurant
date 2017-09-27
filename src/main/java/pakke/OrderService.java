package pakke;
/**
 * Created by Kimia on 20.09.2017.
 */

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Path("/order/")
public class OrderService {
    private static ArrayList<Order> orders = new ArrayList<>();
    private static final AtomicInteger count = new AtomicInteger(0);
    private static ArrayList<Table> tables = new ArrayList<>(3);
    static {
        for(int i = 0; i < 3; i++){
            tables.add(new Table(i+1, new ArrayList<Order>()));
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addOrder(Order order) {
        int customerid = count.incrementAndGet();
        order.setCustomerid(customerid); //Gir id, autoincrement

        String appetizer = order.getAppetizer();
        String maincourse = order.getMainCourse();
        String dessert = order.getDessert();

        //Counts dishes to add to reservationtime
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

        //Changes the date from a String to Date, adds 30min with every dish ordered. Formats back to String
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss a");
            Date date2 = formatter.parse(order.getFromTime()+":00 AM");
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(date2);
            cal2.add(Calendar.MINUTE, numfood*30);
            SimpleDateFormat printTimeFormat = new SimpleDateFormat("HH:mm:ss a");
            order.setToTime(printTimeFormat.format(cal2.getTime()));
        } catch (Exception e){
            e.printStackTrace();
        }

        //Check if there is any tables ordered within time interval of order
        int taken = 0;
        for(int i = 0; i<tables.size();i++){
            if(tables.get(i).checkOrder(order)) {
                order.setTablenr(i + 1);
                tables.get(i).getOrders().add(order);
                orders.add(order);
                break;
            } else {
                taken++;
            }
        }
        if(taken == tables.size()){
            throw new javax.ws.rs.NotFoundException("No tables available, please try again");
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
