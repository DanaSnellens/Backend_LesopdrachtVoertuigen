// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        c.startEngine();
        c.accelerate();

        FlyingCar fc = new FlyingCar();
        fc.startEngine();
        fc.brake();

        Plane p = new Plane();
        p.startEngine();
        p.changeHeight();
        p.turnOffEngine();
    }
}