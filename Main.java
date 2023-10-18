import java.io.Console;

public class Main {
    public static void main (String[] args) {

        String getTheUsersChoice = System.console().readLine("Enter which pizza you want: \n Regular or Deluxe? \n "); 

        if (getTheUsersChoice.equals("Regular")) {
        pizza basePizza = new pizza(true); 
        basePizza.addExtraToppings();
        basePizza.addExtraCheese();
        basePizza.takeAway();
        basePizza.getTheBill();
        }
       

        if (getTheUsersChoice.equals("Deluxe")) {
        deluxePizza dp = new deluxePizza(true); 
        dp.addExtraCheese();
        dp.addExtraToppings();
        dp.getTheBill(); 
        }
       
    }
}