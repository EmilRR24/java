public class BankAccount {
    // MEMBER VARIABLES
        private double checkingBalance = 0.0;
        private double savingsBalance = 0.0;
        private static int numberOfAccounts = 0;
        private static double totalAmount = 0.0;

    // CONSTRUCTOR METHODS
    // FULL CONSTRUCTOR
    public BankAccount(double checkingBalanceParam, double savingsBalanceParam) {
        this.checkingBalance = checkingBalanceParam;
        this.savingsBalance = savingsBalanceParam;
        numberOfAccounts++;
        totalAmount = checkingBalanceParam + savingsBalanceParam + totalAmount;
    }
    public static void printNumberOfAccounts(){
        System.out.println(numberOfAccounts);
    }
    public static void printTotalAmount(){
        System.out.println(totalAmount);
    }
    // GETTER 
    public double getCheckingBalance() {
        System.out.println(this.checkingBalance);
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        System.out.println(this.savingsBalance);
        return this.savingsBalance;
    }
    // SETTER 
    public double depositChecking(double checkingBalanceParam){
        this.checkingBalance += checkingBalanceParam;
        System.out.println("Checking Balance: " + this.checkingBalance);
        totalAmount += checkingBalanceParam;
        return this.checkingBalance;
    }
    public double depositSavings(double savingsBalanceParam){
        this.savingsBalance += savingsBalanceParam;
        System.out.println("Savings Balance: " + this.savingsBalance);
        totalAmount += savingsBalanceParam;
        return this.savingsBalance;
    }
    public double withdrawChecking(double checkingBalanceParam){
        if(this.checkingBalance >= checkingBalanceParam){
        this.checkingBalance -= checkingBalanceParam;
        System.out.println("Checking Balance: " + this.checkingBalance);
        totalAmount -= checkingBalanceParam;
        return this.checkingBalance;
        }
        System.out.println("Insufficient Funds!");
        return this.checkingBalance;
    }
    public double withdrawSavings(double savingsBalanceParam){
        if(this.savingsBalance >= savingsBalanceParam){
        this.savingsBalance -= savingsBalanceParam;
        System.out.println("Savings Balance: " + this.savingsBalance);
        totalAmount -= savingsBalanceParam;
        return this.savingsBalance;
        }
        System.out.println("Insufficient Funds!");
        return this.savingsBalance;
    }
    public double printAccountTotal(){
        double sum = this.checkingBalance + this.savingsBalance;
        System.out.println("Account total: " + sum);
        return sum;
    }

    // OTHER METHODS
}