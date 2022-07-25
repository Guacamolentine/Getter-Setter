package ua.ithilel.java;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Aston Martin", "DB-9", 2021);
        car.setEngine(new Engine("ZF456HH", 450, 4.0f));
        car.setTransmission(new Transmission("BFG12", 9));
        car.setWheels(new Wheels[]{
                new Wheels("Michlien Pilot Sport", 21),
                new Wheels("Michlien Pilot Sport", 21),
                new Wheels("Michlien Pilot Sport", 21),
                new Wheels("Michlien Pilot Sport", 21)
        });
        car.engineStartButton();
    }
}
