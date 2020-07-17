package com.company.digital_journal.entity;

public enum Category {

    LOW("Low"), MEDIUM("Medium"), HIGH("High");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
