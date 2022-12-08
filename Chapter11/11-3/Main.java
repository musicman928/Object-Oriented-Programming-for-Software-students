import java.nio.file.StandardWatchEventKinds;

public class Main {
    public static void main(String[] args) {
        CheckingAccount act = new CheckingAccount(0,100.0,0.0,100.0);
        System.out.println(act);

        SavingsAccount act0 = new SavingsAccount(1,100.0,1.1111);
        System.out.println(act0);

        Account act1 = new Account(2,302.50,0.0);
        System.out.println(act1);
    }
}
