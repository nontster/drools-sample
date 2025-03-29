package example1.model.drools_group;

public class Item{
    private String code;
    private String name;
    private Integer quantity;
    private Integer price;

   
    
    public Item(String code, String name, Integer quantity, Integer price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
}