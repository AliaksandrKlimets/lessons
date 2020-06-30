package com.company.lesson1.abstr;

public abstract class AbstractFigure {

    private String color;

    public AbstractFigure() {
    }

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // Abstract method doesn't have a body, this method should be override in extended classes
    // Abstract might have no abstract methods, but if it has at least one abstract class - class must be declared as abstract
    public abstract double area();


}
