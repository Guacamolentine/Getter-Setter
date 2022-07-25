package ua.ithilel.java;

public class Transmission {

    private String model;
    private int gears;

    public Transmission(String model, int gears) {
        this.model = model;
        this.gears = gears;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
}
