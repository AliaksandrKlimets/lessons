package com.company.lesson1.abstr;

public class Circle extends AbstractFigure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return this.radius * this.radius * Math.PI;
    }
}
