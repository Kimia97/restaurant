package pakke;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Kimia on 14.09.2017.
 */
public class Table {
    //private boolean taken;
    private int tablenr2;
    private ArrayList<Order> orders = new ArrayList<>();


    public Table(){}

    public Table(int tablenr2,ArrayList<Order> orders) {
        this.tablenr2 = tablenr2;
        this.orders = orders;
    }

    public ArrayList<Order> getOrders(){
        return orders;
    }


   public boolean checkOrder(Order order){
       try{
           SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss a");
           Date fromdate2 = formatter.parse(order.getFromTime()+":00 AM");
           Date todate2 = formatter.parse(order.getToTime() +":00 AM");
           if(orders.size()==0){
               return true;
           } else {
               for (int i = 0; i < orders.size(); i++) {
                   Date fromdate1 = formatter.parse(orders.get(i).getFromTime() + ":00 AM");
                   Date todate1 = formatter.parse(orders.get(i).getToTime() + ":00 AM");
                   System.out.println("Fromdate2: " + fromdate2);
                   if (dateBetween(fromdate1, todate1, fromdate2)) {
                       return false;
                   } else if (dateBetween(fromdate1, todate1, todate2)) {
                       return false;
                   } else if (fromdate2.compareTo(fromdate1) < 0 && todate2.compareTo(todate1) > 0) {
                       return false;
                   }else if((fromdate2.compareTo(fromdate1))== 0 && (todate2.compareTo(todate1)) ==0) {
                       return false;
                   } else {
                       return true;
                   }
               }
           }
       } catch (Exception e){
           e.printStackTrace();
       }
       System.out.println("Something went wrong");
       return false;
    }



    public int getTablenr() {
        return tablenr2;
    }


    public void setTablenr(int tablenr2) {
        this.tablenr2 = tablenr2;
    }

    private boolean dateBetween(Date a, Date b, Date c){
       return a.compareTo(c) * c.compareTo(b) >= 0;
    }
}
