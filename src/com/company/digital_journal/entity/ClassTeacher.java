package com.company.digital_journal.entity;

public class ClassTeacher {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Category category;

    private String login = "123";
    private String password = "123";

    public ClassTeacher(String firstName, String lastName, String phoneNumber, Category category) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.category = category;
    }

    public ClassTeacher() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + "; Last name: " + lastName + "; Phone number: " + phoneNumber + "; Category: " + category.getValue();
    }
}
