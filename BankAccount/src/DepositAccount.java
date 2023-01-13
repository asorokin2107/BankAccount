import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    private LocalDate lastInCome;

    @Override
    public void put(double amount) {
        super.put(amount);
        lastInCome = LocalDate.now();

    }

    @Override
    public void take(double amount) {
        super.take(amount);
        if (LocalDate.now().isAfter(lastInCome.plusDays(30))) {
            super.take(amount);
        } else {
            System.out.println("Вы не сможете снять сейчас денежные средства, следующее списание будет доступно " + lastInCome.plusDays(30));
        }
    }
}
