package web.model;

public class Car {

    private int zeroHundredSeconds;

    private int weight;

    private String color;

    public Car(int zeroHundredSeconds, int weight, String color) {
        this.zeroHundredSeconds = zeroHundredSeconds;
        this.weight = weight;
        this.color = color;
    }


    public int getZeroHundredSeconds() {
        return zeroHundredSeconds;
    }

    public void setZeroHundredSeconds(int zeroHundredSeconds) {
        this.zeroHundredSeconds = zeroHundredSeconds;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
