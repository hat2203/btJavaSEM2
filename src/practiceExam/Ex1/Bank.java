package practiceExam.Ex1;

public class Bank {
    public double balance;
    public double rate;

    public Bank() {

    }

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
     public void calculateInterest(){
        double interest;
        interest = balance*(rate/1200);
        System.out.println("Calculate Interest: "+interest);
     }
}
