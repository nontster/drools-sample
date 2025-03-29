package example1.model.drools_group;

import java.io.Serializable;
import java.util.List;

public class Cart implements Serializable{
    private  List<Item> itemList;
    private final static long serialVersionUID = 7866382419947100208L;
    public Cart() {
    }
    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
    
    
}
