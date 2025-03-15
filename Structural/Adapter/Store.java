public class Store {
    private Payment paymentType;

    // Previously only handled whole number payments
    public void pay(double amount) {
        if(amount % 1 == 0) {
            paymentType = new OldPaymentProcessor((int)amount);
        }
        else {
            paymentType = new PaymentAdapter(amount);
        }
        paymentType.makePayment();
    }

}
