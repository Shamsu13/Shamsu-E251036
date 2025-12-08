
class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;
    static String bankName = "Sonali Bank";

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("-----------------------------------");
    }
}

public class AccountMain {

    public static void main(String args[]) {
        BankAccount.showBankName();
        BankAccount acc1 = new BankAccount(10011, "Shamsu Alam", 150000.00);
        BankAccount acc2 = new BankAccount(10022, "Ahsanul Karim Tanim", 175000.00);
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}
