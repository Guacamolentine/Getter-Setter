package ua.ithilel.java;

public class Engine {

    private String model;
    private int power;
    private float volume;

    public Engine(String model, int power, float volume) {
        this.model = model;
        this.power = power;
        this.volume = volume;
    }

    public Engine() {
    }

    public void  start(){
        System.out.println("Engine is started...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
