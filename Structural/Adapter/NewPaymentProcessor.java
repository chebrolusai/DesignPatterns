public class NewPaymentProcessor {
    double amount;

    // This class can handle payment in double
    public NewPaymentProcessor(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Succesfully completed the Payment of " + this.amount + ".");
    }
}
