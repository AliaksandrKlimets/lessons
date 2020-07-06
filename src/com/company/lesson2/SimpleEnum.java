package com.company.lesson2;

public enum SimpleEnum {

    MINIMUM(200), MEDIUM(300), MAXIMUM(400);


    private int value;

    SimpleEnum(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }
}
