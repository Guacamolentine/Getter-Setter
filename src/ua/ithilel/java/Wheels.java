package ua.ithilel.java;

public class Wheels {

    private String model;
    private int radius;

    public Wheels(String model, int radius) {
        this.model = model;
        this.radius = radius;
    }
    public Wheels(){
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
