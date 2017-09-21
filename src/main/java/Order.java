/**
 * Created by Kimia on 14.09.2017.
 */
import java.util.*;
public class Order {
    private int customerid;
    private int tablenr;
    private int guests;
    private String appetizer;
    private String mainCourse;
    private String dessert;
    private String drink;
    private int amountDrink;
    private Date time;



    public Order(){

    }

    public int getCustomerid(){
        return customerid;
    }

    public int getAmountDrink() {
        return amountDrink;
    }

    public void setAmountDrink(int amountDrink) {
        this.amountDrink = amountDrink;
    }

    public void setCustomerid(int customerid){
        this.customerid = customerid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getTablenr() {
        return tablenr;
    }

    public void setTablenr(int tablenr) {
        this.tablenr = tablenr;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
