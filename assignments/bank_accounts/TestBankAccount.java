public class TestBankAccount{
    public static void main(String[] args){

        BankAccount newBankAccount1 = new BankAccount(10.0, 20.0);

        BankAccount newBankAccount2 = new BankAccount(20.0, 20.0);

        BankAccount.printNumberOfAccounts();

        newBankAccount1.getCheckingBalance();

        newBankAccount2.getSavingsBalance();

        newBankAccount1.depositChecking(20.0);

        newBankAccount2.depositSavings(30.0);

        newBankAccount1.withdrawSavings(30.0);
        
        newBankAccount2.withdrawSavings(30.0);

        newBankAccount2.printAccountTotal();

    }
}