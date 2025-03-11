class BankAccount {
    // Static variable
    public static String bankName = "Javabeans Bank";

    // Static method for total accounts
    private static int totalAccounts = 0;

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Instance variables
    private String accountHolderName;
    private final int accountNumber;

    // Constructor using 'this' for clarity
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Getter methods
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Instanceof demonstration in main
}

public class BankAccountSystem {
    public static void main(String[] args) {
        // Testing BankAccount class
        BankAccount acc1 = new BankAccount("Manan Gupta", 101);
        BankAccount acc2 = new BankAccount("Raj Singh", 102);

        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Account Holder: " + acc1.getAccountHolderName() + ", Account Number: " + acc1.getAccountNumber());
        System.out.println("Account Holder: " + acc2.getAccountHolderName() + ", Account Number: " + acc2.getAccountNumber());

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

        if (acc1 instanceof BankAccount) {
            System.out.println("Account 1 is an instance of BankAccount.");
        }
    }
}

////Sample Output
//Bank Name: Javabeans Bank
//Account Holder: Manan Gupta, Account Number: 101
//Account Holder: Raj Singh, Account Number: 102
//Total Accounts: 2
//Account 1 is an instance of BankAccount.

