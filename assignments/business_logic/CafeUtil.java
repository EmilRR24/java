import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
  // METHOD SIGNATURE - int
  public int getStreakGoal(){
    int total = 0;
    for(int i = 1; i < 11; i++){
      total += i;
      // total = total + i;
    }
    return total;
  }
  // METHOD SIGNATURE - double
  public double getOrderTotal(double[] prices){
    double sum = 0.0;
    int i = 1;
    while(i < prices.length){
      sum += prices[i];
      i++;
    }
    return sum;
  }
  // METHOD SIGNATURE - void
  public void displayMenu(ArrayList<String> menuItems){
    int i = 0;
    while( i < menuItems.size()){
      System.out.println(i + " " + menuItems.get(i));
      i++;
    }
  }
  // METHOD SIGNATURE - undefined (no return)
  public void addCustomer(ArrayList<String> customers){
    System.out.println("Please enter your name:");
    String userName = System.console().readLine();
    System.out.println("Hello, " + userName + "!");
    System.out.println("There are " + customers.size() + " people in front of you.");
    customers.add(userName);
    System.out.println(customers);
  }
}