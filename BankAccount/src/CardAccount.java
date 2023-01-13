public class CardAccount extends BankAccount {

    private static final int PROCENT = 1;

    public void takeInCard(double amount) {
        super.take(amount + ((amount / 100) * PROCENT));
    }

}

