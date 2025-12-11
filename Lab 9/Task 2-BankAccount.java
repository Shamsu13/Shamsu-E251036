public class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: TK" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountHolder("Shamsu Alam");
        acc.setAccountNumber("BA202512345");
        acc.setBalance(250000.50);
        acc.displayAccountInfo();
    }
}
