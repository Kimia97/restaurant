package pakke;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    /*public Date getDate(){
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss a");
            Date date2 = formatter.parse(order.getFromTime()+":00 AM");
            Calendar cal2 = Calendar.getInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
    }*/

   public boolean checkOrder(Order order){
       try{
           SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss a");
           Date fromdate2 = formatter.parse(order.getFromTime()+":00 AM");
           Date todate2 = formatter.parse(order.getToTime() +":00 AM");
           Calendar fromcal2 = Calendar.getInstance();
           for (int i = 0; i<orders.size(); i++){
               Date fromdate1 = formatter.parse(orders.get(i).getFromTime()+":00 AM");
               Date todate1 = formatter.parse(orders.get(i).getToTime()+":00 AM");
               Calendar fromcal1 = Calendar.getInstance();
               if(((fromdate2.compareTo(fromdate1) > 0) && ((fromdate2.compareTo(todate1)<0)))
                       || ((todate2.compareTo(fromdate1)>0)&&(todate2.compareTo(todate1)<0)) ||
                       ((fromdate1.compareTo(fromdate2)>0) &&((todate1.compareTo(todate2)<0)))){
                   return false;
               } else {
                   return true;
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
}
