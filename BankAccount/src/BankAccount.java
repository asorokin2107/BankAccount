import java.time.LocalDate;
import java.util.Scanner;

public class BankAccount {

    private double amount = 0;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public void put(double amount) {
        if (amount > 0) {
            setAmount(this.amount + amount);
            System.out.println("Вы положили на баланс " + amount + " рублей.");
        } else {
            System.out.println("Error");
        }


    }

    public void take(double amount) {
        if (amount > this.amount && amount > 0) {
            System.out.println("Error");
        } else {
            this.amount -= amount;
            System.out.println("Вы сняли " + amount + " рублей.");

        }
    }

}
