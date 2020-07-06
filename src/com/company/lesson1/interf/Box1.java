package com.company.lesson1.interf;

public class Box1 implements Areable {

    private double size;

    public Box1(double size) {
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
        return 6 * size * size;
    }
}
