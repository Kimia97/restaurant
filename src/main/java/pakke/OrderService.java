package pakke; /**
 * Created by Kimia on 20.09.2017.
 */

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Path("/order/")
public class OrderService {
    private static ArrayList<Order> orders = new ArrayList<>(4);
    private static final AtomicInteger count = new AtomicInteger(0);
    //private static ArrayList<Customer> customers = new ArrayList<>();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addOrder(Order order) {
        int customerid = count.incrementAndGet();
        order.setCustomerid(customerid);
        orders.add(order);
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
