package com.company.lesson1.abstr;

public class Box extends AbstractFigure {

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

    @Override
    public double area() {
        return 6 * this.size * this.size;
    }
}
