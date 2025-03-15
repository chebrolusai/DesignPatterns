public class PaymentAdapter implements Payment{
    NewPaymentProcessor paymentProcessor;

    public PaymentAdapter(double amount) {
        paymentProcessor = new NewPaymentProcessor(amount);
    }

    @Override
    public void makePayment() {
        paymentProcessor.processPayment();
    }
}
