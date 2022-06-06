public class CafeJava {
  public static void main(String[] args) {
    // APP VARIABLES
    // Lines of text that will appear in the app. 
    String generalGreeting = "Welcome to Cafe Java, ";
    String pendingMessage = ", your order will be ready shortly";
    String readyMessage = ", your order is ready";
    String displayTotalMessage = "Your total is $";
    
    // Menu variables (add yours below)
    double mochaPrice = 3.5;
    double coffeePrice = 4.00;
    double lattePrice = 4.25;
    double cappuccinoPrice = 5.00;

    // Customer name variables (add yours below)
    String customer1 = "Cindhuri";
    String customer2 = "Sam";
    String customer3 = "Jimmy";
    String customer4 = "Noah";

    // Order completions (add yours below)
    boolean isReadyOrder1 = false;

    // APP INTERACTION SIMULATION (Add your code for the challenges below)
    // Example:
    System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
  // ** Your customer interaction print statements will go here ** //
    System.out.println(displayTotalMessage + coffeePrice);
    System.out.println(customer1 + pendingMessage);
    System.out.println(customer1 + readyMessage);

    System.out.println(generalGreeting + customer4); 
    System.out.println(displayTotalMessage + cappuccinoPrice);
    if(isReadyOrder1 == true){
    System.out.println(customer4 + readyMessage);
    } 
    else{
    System.out.println(customer4 + pendingMessage);
    }

    System.out.println(generalGreeting + customer2); 
    System.out.println(displayTotalMessage + (2*lattePrice));
    isReadyOrder1 = true;
    if(isReadyOrder1 == true){
    System.out.println(customer2 + readyMessage);
    }
    else{
    System.out.println(customer2 + pendingMessage);
    }

    System.out.println(generalGreeting + customer3);
    System.out.println(displayTotalMessage + (lattePrice-coffeePrice));

    System.out.println(displayTotalMessage + mochaPrice);
    mochaPrice = 3.75;
    System.out.println(displayTotalMessage + mochaPrice);

    System.out.println(isReadyOrder1);
    isReadyOrder1 = false;
    System.out.println(isReadyOrder1);
  }
}
