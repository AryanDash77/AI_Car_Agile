public class PaymentProcessor {
    public boolean processCreditCard(String cardNumber, double amount) {
        return cardNumber.length() == 16 && amount > 0;
    }

    public boolean processBankTransfer(String routingNumber, String accountNumber, double amount) {
        return routingNumber.length() == 9 && amount > 0;
    }
}


