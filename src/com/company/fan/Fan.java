package com.company.fan;

public class Fan {
    private int speed;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "";

    public Fan() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (this.isOn)
            this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        if (this.isOn) {
            return "Fan speed is: " + this.speed + ", Fan color is: " + this.color + ", Fan radius is: " + this.radius + ", Fan is on";
        } else
            return " Fan color is: " + this.color + ", Fan radius is: " + this.radius + ", Fan is off";
    }
}
