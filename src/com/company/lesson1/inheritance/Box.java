package com.company.lesson1.inheritance;

public class Box extends Figure{

    private double size;

    public Box(double size) {
        this.size = size;
    }

    public Box(String color, double size) {
        super(color);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
