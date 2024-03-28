package module2_1.Task3;


import java.util.Random;
public class CoffeeMakerUser {
    public static void main(String[] args) {
        Random random = new Random();
        CoffeeMaker nokipannu = new CoffeeMaker();
        nokipannu.pressOnOff();
        for (int i = 1; i < 11; i++) {
            System.out.println("I want coffee. This is my " + i + " try to use the damn machine.");

            boolean rememberedToPutTheCoffeeMakerOn = random.nextBoolean();
            if(rememberedToPutTheCoffeeMakerOn) {
            nokipannu.pressOnOff();
            }
            if (i == 1){
                nokipannu.setCoffeeType();
                nokipannu.setAmountOfCoffee();}
            if (i % 4 == 0){
                nokipannu.setCoffeeType();
                nokipannu.setAmountOfCoffee();
            }
            else{
                if (nokipannu.isOn()){
                    System.out.println("Drinking " + nokipannu.getAmountOfCoffee() + "ml of "+nokipannu.getCoffeeType());
                    }
                else {
                    System.out.println("Coffeemaker is not on.");
                    }
            }
        }
        }
    }
