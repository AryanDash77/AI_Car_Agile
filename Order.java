public class Order {
    private String orderId;
    private Customer buyer;
    private Car purchasedCar;
    private boolean isPaid;

    public Order(String orderIdParam, Customer buyerParam, Car carParam) {
        orderId = orderIdParam;
        buyer = buyerParam;
        purchasedCar = carParam;
        isPaid = false;
    }

    // Add getters to resolve the "unused field" warnings
    public String getOrderId() {
        return orderId;
    }

    public Customer getBuyer() {
        return buyer;
    }

    public Car getPurchasedCar() {
        return purchasedCar;
    }

    public void markAsPaid() {
        isPaid = true;
    }

    public boolean getPaymentStatus() {
        return isPaid;
    }
}

