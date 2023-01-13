import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        CardAccount cardAccount = new CardAccount();
        DepositAccount depositAccount = new DepositAccount();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\t\t\tIDEA BANK");
            System.out.println("Здравствуйте уважаемый клиент!");
            System.out.println("Выберите интересующую вас услугу:");
            System.out.println("1.Пополнить на банковский счет.");
            System.out.println("2.Пополнить карту банка.");
            System.out.println("3.Пополнить депозитный счет.");
            System.out.println("4.Снять с банковского счета.");
            System.out.println("5.Снять с банковской карты.");
            System.out.println("6.Снять с депозита.");
            System.out.println("7.Инфо о счете.");
            int choice = scanner.nextInt();

            if (choice == 1) {
                bankAccount.put(879);
                continue;
            }

            if (choice == 2) {
                cardAccount.put(424);
                continue;
            }

            if (choice == 3) {
                depositAccount.put(143);
                continue;
            }

            if (choice == 4) {
                bankAccount.take(43);
                continue;
            }

            if (choice == 5) {
                cardAccount.takeInCard(43);
                continue;


            }

            if (choice == 6) {
                depositAccount.take(64);
                continue;
            }

            if (choice == 7) {
                System.out.println("На вашем счету " + bankAccount.getAmount());
                System.out.println("Баланс вашей карты " + cardAccount.getAmount());
                System.out.println("Депозитный счет " + depositAccount.getAmount());
                System.out.println("Общий баланс в нашем банке " + (cardAccount.getAmount() + bankAccount.getAmount()));
                continue;
            }
        }
    }
}
