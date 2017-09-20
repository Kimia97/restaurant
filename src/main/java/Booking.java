/**
 * Created by Kimia on 14.09.2017.
 */
import java.util.*;
public class Booking {
    private Table table;
    private int guests;
    private String appetizer;
    private String mainCourse;
    private String dessert;
    private String drink;
    private Date time;



    public Booking(Table table, int guests, String appetizer, String mainCourse, String dessert, String drink, Date time) {
        this.table = table;
        this.guests = guests;
        this.appetizer = appetizer;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.drink = drink;
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
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
