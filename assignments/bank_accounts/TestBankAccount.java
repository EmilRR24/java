public class TestBankAccount{
    public static void main(String[] args){

        BankAccount newBankAccount1 = new BankAccount(10.0, 20.0);

        BankAccount newBankAccount2 = new BankAccount(20.0, 20.0);

        System.out.println(BankAccount.numberOfAccounts);

        System.out.println(newBankAccount1.totalAmount);

    }
}