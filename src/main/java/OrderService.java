/**
 * Created by Kimia on 20.09.2017.
 */
import com.sun.org.apache.xpath.internal.operations.Or;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/order/")
public class OrderService {
    private static ArrayList<Order> orders = new ArrayList<>();
    private static ArrayList<Customer> customers = new ArrayList<>();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addCustomer(Customer customer) { customers.add(customer.getCustomerid(), customer);}

}
