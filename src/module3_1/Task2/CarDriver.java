package module3_1.Task2;

public class CarDriver {

    public static void main(String[] args) {
        Bus jouko;

        jouko = new Bus("jouko", 200, 80);
        System.out.println("Bus details: ");
        System.out.println("Bus: " + jouko.getTypeName());
        System.out.println("Gasoline tank capacity: " + jouko.getGasolineTankCpacity() + "l, and  current gasoline level: " + jouko.getGasolineLevel() + "l");
        System.out.println("Current speed: " + jouko.getSpeed() + "km/h, and the top speed: " + jouko.getTopSpeed() + "km/h");
        System.out.println(" ");
        jouko.fillTank();

        for (int i = 0; i < jouko.getTopSpeed()/ 10; i++) {
            jouko.accelerate();
            System.out.println(jouko.getTypeName() + ": speed is " + jouko.getSpeed() + " km/h");
            System.out.println("My car gasoline level: "+jouko.getGasolineLevel());
            System.out.println();
           
        }
        // Lisätään ja poistetaan matkustajia vauhista
        jouko.passengerEnter(2);
        System.out.println("Matkustajia: "+jouko.getPassengers());
        jouko.passengerExit(2);


        while (jouko.getSpeed() > 0) {
            jouko.decelerate(15);
            System.out.println(jouko.getTypeName() + ": speed is " + jouko.getSpeed() + " km/h");
            
        }
        // Lisätään ja poistetaan matkustajia
        jouko.passengerEnter(20);
        jouko.passengerExit(5);
        jouko.passengerEnter(2);
        jouko.passengerExit(17);
    }
}
