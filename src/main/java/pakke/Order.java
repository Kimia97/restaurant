package pakke; /**
 * Created by Kimia on 14.09.2017.
 */

public class Order {
    private String name;
    private int customerid;
    private int guests;
    private String appetizer;
    private String mainCourse;
    private String dessert;
    private String drink;
    private int amountDrink;
    private String fromTime;
    private String toTime;
    private int tablenr;

    public Order(){}

    public int getTablenr() {
        return tablenr;
    }

    public void setTablenr(int tablenr) {
        this.tablenr = tablenr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountDrink() {
        return amountDrink;
    }

    public void setAmountDrink(int amountDrink) {
        this.amountDrink = amountDrink;
    }

    public int getCustomerid(){
        return customerid;
    }

    public void setCustomerid(int customerid){
        this.customerid = customerid;
    }

    public String getFromTime() {return fromTime;}

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
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

// eline testerhehehe