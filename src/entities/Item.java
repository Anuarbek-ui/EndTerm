package entities;

public class Item {
    private String item_name;
    private int item_id;
    private String category;
    private double price;
    private double units_available;
    private double discount_amount;

    public Item(String item_name, int item_id, String category, double price, double units_available, double discount_amount) {
        this.item_name = item_name;
        this.item_id = item_id;
        this.category = category;
        this.price = price;
        this.units_available = units_available;
        this.discount_amount = discount_amount;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getUnits_available() {
        return units_available;
    }

    public void setUnits_available(double units_available) {
        this.units_available = units_available;
    }

    public double getDiscount_amount() {
        return discount_amount;
    }

    public void setDiscount_amount(double discount_amount) {
        this.discount_amount = discount_amount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item_name='" + item_name + '\'' +
                ", item_id=" + item_id +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", units_available=" + units_available +
                ", discount_amount=" + discount_amount +
                '}';
    }
}