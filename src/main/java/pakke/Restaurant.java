package pakke;

import java.util.ArrayList;

/**
 * Created by Kimia on 20.09.2017.
 */
public class Restaurant {
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Table> tables = new ArrayList<>();

    public Restaurant(){
    }

    public int numTakenTables(){
        int number = 0;
        for (int i = 0; i< tables.size(); i++){
            if(tables.get(i).isTaken()){
                number++;
            }
        }
        return number;
    }

    public int numTables(){
        return tables.size();
    }
    public int numOrders(){
        return orders.size();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }
}
