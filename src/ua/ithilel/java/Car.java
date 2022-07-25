package ua.ithilel.java;

public class Car {

    private Engine engine;
    private Transmission transmission;
    private Wheels[] wheels;
    private final String label;
    private final String model;
    private final int year;

    public Car(String label, String model, int year) {
        this.label = label;
        this.model = model;
        this.year = year;
    }

    public void engineStartButton(){
        System.out.println("Button is pressed");
        System.out.println("Sysyem checking...");
        engine.start();
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Wheels[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheels[] wheels) {
        this.wheels = wheels;
    }

    public String getLabel() {
        return label;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
