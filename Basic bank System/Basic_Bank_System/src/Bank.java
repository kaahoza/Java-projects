import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    private Map<String, Account> accounts;

    public Bank () {
        this.accounts = new HashMap<>();
    }

    public void addAccount(String accountNumber, String customerName, double balance) {
        Account account = new Account(accountNumber, customerName, balance);
        accounts.put(accountNumber, account);
    }

    public void displayAccountInfo(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Customer Name: " + account.getCustomerName());
            System.out.println("Account Balance: " + account.getBalance());
        } else {
            System.out.println("Account Not Found");
        }
    }

    public void performDepositTransaction(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.deposit(amount);
            System.out.println("Transaction Successful and Account updated. Available balance: " + account.getBalance());
        } else {
            System.out.println("Account Not Found");
        }
    }

    public void performWithdrawal( String accountNumber, double amount ) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.withdraw(amount);
            if (amount <= account.getBalance()){
                System.out.println("R"+amount+ " " + "Has been withdrawn." );
            } else {
                System.out.println("Insufficient funds to withdraw");
            }

        }
    }


}
