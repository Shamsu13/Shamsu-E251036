interface ATMService {

    void withdraw(double amount);

    void deposit(double amount);

    void checkBalance();
}

class DBBL implements ATMService {

    private double balance;

    public DBBL(double initialBalance) {
        balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! Transaction failed.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited: " + amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class Main {

    public static void main(String[] args) {
        DBBL myAccount = new DBBL(1000);
        myAccount.checkBalance();
        myAccount.deposit(500);
        myAccount.withdraw(300);
        myAccount.checkBalance();
    }
}
