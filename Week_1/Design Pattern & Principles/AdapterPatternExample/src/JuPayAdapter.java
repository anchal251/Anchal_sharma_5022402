public class JuPayAdapter implements PaymentProcessor {
    JuPay juPay = new JuPay();
    @Override
    public void processPayment() {
        juPay.processPayment();
    }
}
