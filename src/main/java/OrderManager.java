import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> activeOrders;

    public OrderManager() {
        activeOrders = new ArrayList<>();
    }

    public void createOrder(Order newOrder) {
        activeOrders.add(newOrder);
    }

    public void completeOrder(Order currentOrder) {
        currentOrder.markAsPaid();
    }
}


