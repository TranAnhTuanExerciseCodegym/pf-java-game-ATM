import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 1000;
    private double annualInterestsRate = 0;
    private Date dateCreated;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestsRate() {
        return annualInterestsRate;
    }

    public void setAnnualInterestsRate(double annualInterestsRate) {
        this.annualInterestsRate = annualInterestsRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {
        double monthlyInterestRate = (getAnnualInterestsRate() / 100) / 12;
        return monthlyInterestRate;
    }

    public double getMonthlyInterest() {
        double monthlyInterest = getBalance() * getMonthlyInterestRate();
        return monthlyInterest;
    }

    public double withdraw(double withdrawMoney) {
        this.balance = this.getBalance() - withdrawMoney;
        return this.balance;
    }

    public double deposit(double depositMoney) {
        this.balance = this.getBalance() + depositMoney;
        return this.balance;
    }


}
