import java.util.ArrayList;

/**
 * Created by BUBBABAIRD on 4/19/17.
 */
public class Bill {
    String tableId;
    ArrayList<MenuItem>items;

    public Bill() {

    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Bill(String tableId, ArrayList<MenuItem> items) {
        this.tableId = tableId;
        this.items = items;

    }
}
