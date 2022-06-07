public class BankAccount {
    // MEMBER VARIABLES
        private double checkingBalance = 0.0;
        private double savingsBalance = 0.0;
        public static int numberOfAccounts = 0;
        public static double totalAmount = 0.0;

    // CONSTRUCTOR METHODS
    // FULL CONSTRUCTOR
    public BankAccount(double checkingBalanceParam, double savingsBalanceParam) {
        checkingBalance = checkingBalanceParam;
        savingsBalance = savingsBalanceParam;
        numberOfAccounts++;
        totalAmount = checkingBalance + savingsBalance + totalAmount;
    }
    
    // GETTER / SETTER /OTHER METHODS
    public double getCheckingBalance() {

    }
}