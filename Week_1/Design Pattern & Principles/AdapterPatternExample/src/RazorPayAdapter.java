public class RazorPayAdapter implements PaymentProcessor {
    RazorPay razorPay = new RazorPay();
    @Override
    public void processPayment() {
        razorPay.processPayment();
    }
}
