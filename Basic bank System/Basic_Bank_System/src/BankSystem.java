public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        //pass few accounts
//        bank.addAccount("12345", "Anele", 50000);
        bank.addAccount("12346", "Khanyisa", 20000);

        //deposit to account
        //bank.performDepositTransaction("12345", 1500);

        //withdraw
        bank.performWithdrawal("12346",3000);

        //display account information
        bank.displayAccountInfo("12346");

        //Account not found
        //bank.performDepositTransaction("12347", 5000);

    }
}
