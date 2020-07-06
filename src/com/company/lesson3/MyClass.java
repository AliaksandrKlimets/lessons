package com.company.lesson3;

public class MyClass implements DefInterface{

    private int value;
    private double dValue;

    public MyClass() {
    }

    public MyClass(int value, double dValue) {
        this.value = value;
        this.dValue = dValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return this.value * 30 + (int) this.dValue * 35;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return value == myClass.value &&
                Double.compare(myClass.dValue, dValue) == 0;
    }

    @Override
    public String toString() {
        return "This is object of class MyObject with fields value: " + this.value + ", dValue: " + this.dValue;
    }
}
