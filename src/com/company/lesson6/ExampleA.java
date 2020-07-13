package com.company.lesson6;

import java.util.Objects;

public class ExampleA {
    private Integer value;

    public ExampleA(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExampleA exampleA = (ExampleA) o;
        return Objects.equals(value, exampleA.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    //    @Override
//    public int compareTo(ExampleA o) {
//        return Integer.compare(this.value, o.getValue());
//    }
}
