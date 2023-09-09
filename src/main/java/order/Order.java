package order;

import java.util.List;

public class Order {
    private Long id;
    private List<Item> items;

    public Order(Long id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public Double getTotalAmount() {
        Double totalAmount = 0.0;

        for(Item item: this.items) {
            totalAmount += item.getTotalAmount();
        }

        return totalAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
