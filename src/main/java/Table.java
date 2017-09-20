/**
 * Created by Kimia on 14.09.2017.
 */
public class Table {
    private boolean taken;
    private int tablenr;

    /**
     *
     * @param taken = true if the table is booked
     * @param tablenr = number of the
     */
    public Table(boolean taken, int tablenr) {
        this.taken = taken;
        this.tablenr = tablenr;
    }

    public boolean isTaken() {
        return taken;
    }

    public int getTablenr() {
        return tablenr;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    public void setTablenr(int tablenr) {
        this.tablenr = tablenr;
    }
}
