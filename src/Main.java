// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        vehicle.start();
        vehicle.stop();
        car.start();
        car.stop();
        motorcycle.start();
        motorcycle.stop();
    }
}