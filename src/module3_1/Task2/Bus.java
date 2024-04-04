package module3_1.Task2;

public class Bus extends Car {
    private  int passengers;
    public Bus(String typeName, double gasolineTankCapacity, double topSpeed) {
        super(typeName,gasolineTankCapacity, topSpeed);
        setSpeed(0); setGasolineLevel(0);
        setPassengers(0);
    }


    public void setPassengers(int passengers){
        this.passengers = passengers;
    }
    int getPassengers(){
        return passengers;
    }
    void passengerEnter(int amount) {
        if (getSpeed() == 0) {
            setPassengers(getPassengers() + amount);
            System.out.println(amount + " passengers entered Bus.");
            System.out.println("Current amount of passengers: " + getPassengers());
        }
        else {
            System.out.println("Buss cannot take passengers while moving.");
            System.out.println("Current speed: " + getSpeed());
        }
    }
    void passengerExit(int amount) {
        if (getSpeed() == 0 && getPassengers() > 0){
            setPassengers(getPassengers() - amount);
            System.out.println(amount + " passengers entered Bus.");
            System.out.println("Current amount of passengers: " + getPassengers());
        }
        else{
            System.out.println(getPassengers() < 1 ? "There is no passengers in the bus." : "Buss cannot let passengers out while moving.");
        }
    }
    
}
