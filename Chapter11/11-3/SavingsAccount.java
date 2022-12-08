import java.util.Date;

public class SavingsAccount extends Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();


    public SavingsAccount() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
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
                ", Date Created: " + dateCreated;
    }

    public void withdraw(double amount) {
        if (balance - amount > 0) {
            balance -= amount;
        } else {System.out.println("Cannot overdraw savings account");}
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
