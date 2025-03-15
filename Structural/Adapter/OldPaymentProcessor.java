public class OldPaymentProcessor implements Payment{
    int amount;

    // Handles payment in int only.
    public OldPaymentProcessor(int amount) {
        this.amount = amount;
    }
    @Override
    public void makePayment() {
        System.out.println("Payment of " + this.amount + " made.");
    }
}
