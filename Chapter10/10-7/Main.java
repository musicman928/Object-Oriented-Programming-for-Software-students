import java.util.Scanner;

public class Main {
    public static Account[] act = new Account[10];
    private static int currentId;

    public static void main(String[] args) {
        initActs(act);
        mainLoop();
    }

    public static void printBalance(Account act) {
        System.out.printf(
                "Balance: %f\nMonthly Interest: %f\nDate Opened: %s\n",act.getBalance(),act.getMonthlyInterest(),act.getDateCreated()
        );

    }

    public static void mainLoop() {
        while (true) {
            promptUserId();
            mainMenu();
        }

    }

    public static void promptUserId() {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your account ID: ");
        int id = in.nextInt();
        System.out.println();

        while (id >= act.length || id < 0) {
            System.out.println("Invalid Id");
            System.out.print("Please enter your account ID: ");
            id = in.nextInt();
            System.out.println();
        }
        currentId = id;
        System.out.println("Account login successful!\n");

    }

    public static void mainMenu() {
        int action = 0;
        Scanner in = new Scanner(System.in);

        while(action != 4) {

            System.out.println("1. View current balance  2. Withdraw  3. Deposit  4. Exit");
            action = in.nextInt();

            switch (action) {
                case 1:
                    System.out.printf("Your current balance is $%.2f\n\n",act[currentId].getBalance());
                    break;

                case 2:
                    System.out.print("How much would you like to withdraw? ");
                    double withdrawAmt = in.nextDouble();
                    act[currentId].withdraw(withdrawAmt);
                    System.out.printf("\nYou withdrew $%.2f, Your new balance is $%.2f\n\n",withdrawAmt,act[currentId].getBalance());
                    break;

                case 3:
                    System.out.print("How much would you like to deposit? ");
                    double depositAmt = in.nextDouble();
                    act[currentId].deposit(depositAmt);
                    System.out.printf("\nYou deposited $%.2f, Your new balance is $%.2f\n\n",depositAmt,act[currentId].getBalance());
                    break;


                case 4: System.out.print("Exiting\n\n");
                    break;


            }
        }

    }

    public static void initActs(Account[] account) {
        for (int i = 0; i < act.length - 1; i++) {
            account[i]= new Account(i, 100, 0.1);
        }
    }


}
