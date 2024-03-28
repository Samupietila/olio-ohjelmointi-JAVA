package module2_1.Task3;
import java.util.Scanner;
import java.util.Objects;

public class CoffeeMaker {
    private  static String coffeeType;
    private  static double amountOfCoffee;
    private static boolean isCoffeeMakerOn;
    Scanner sc = new Scanner(System.in);
    public CoffeeMaker(){
        isCoffeeMakerOn = false;
        coffeeType = null;
        amountOfCoffee = 0;
    }

    public boolean isOn() {
        return isCoffeeMakerOn;
    }
    void pressOnOff(){
        isCoffeeMakerOn = !isCoffeeMakerOn;
    }
    public double getAmountOfCoffee(){
        return amountOfCoffee;
    }
    void setAmountOfCoffee(){
        if(isCoffeeMakerOn) {
            do{
               System.out.println("Give the amount of coffee in milliliters between 10–80");
              this.amountOfCoffee = sc.nextInt();
            if(this.amountOfCoffee <= 80 && this.amountOfCoffee >= 10) {
                System.out.println("Good choice!");
            } else {
                System.out.println("Wrong input");
                this.amountOfCoffee = 0;
            } } while(this.amountOfCoffee == 0);
        }
    }
    public String getCoffeeType(){
        return coffeeType;
    }

    void setCoffeeType() {
       if (isCoffeeMakerOn) {
           do{
               System.out.println("Select coffeeType: (1)Normal, (2)Espresso");
               this.coffeeType = sc.nextLine();
           switch (coffeeType) {
               case "1":
                   this.coffeeType = "Normal";
                   break;
               case "2":
                   this.coffeeType = "Espresso";
                   break;
               default:
                   System.out.println("Wrong input");
                   this.coffeeType = "null";
           }
       } while(this.coffeeType.equals("null"));
       }else {
           System.out.println("Cannot change the settings because the coffeemaker is not on.");
       }
   }
}
