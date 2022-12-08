import java.util.Date;

public class CheckingAccount extends Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();
    private double overdraftLimit;


    public CheckingAccount() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        overdraftLimit = 50;
    }

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.overdraftLimit = overdraftLimit;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();
    }

    public String toString() {
        return "Account type: " + this.getClass().getName() + ", Id: " + id +
                ", Balance: " + balance +
                ", Annual Interest Rate: " + annualInterestRate +
                ", Overdraft Limit: $" + overdraftLimit +
                ", Date Created: " + dateCreated;
    }

    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        }else {System.out.println("Cannot withdraw past overdraft limit");}
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
