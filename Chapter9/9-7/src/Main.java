public class Main {
    public static void main(String[] args) {
        Account act = new Account();
            act.make(1122,20000,4.5);
            act.withdraw(2500);
            act.deposit(3000);

            printBalance(act);

    }

    public static void printBalance(Account act) {
        System.out.printf(
                "Balance: %f\nMonthly Interest: %f\nDate Opened: %s",act.getBalance(),act.getMonthlyInterest(),act.getDateCreated());

    }
}
