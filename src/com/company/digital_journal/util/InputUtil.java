package com.company.digital_journal.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUtil {

    private String enterText() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "";
    }

    public String getString(String message) {
        System.out.println(message);
        return enterText();
    }

    public int getInteger(String message, int minValue) {
        while(true) {
            System.out.println(message);
            String text = enterText();
            if (text.matches("^[\\d]+$")) {
                int result = Integer.parseInt(text);
                if (result <= minValue) {
                    System.out.println("Enter bigger value");
                } else {
                    return result;
                }
            } else {
                System.out.println("You entered not a number");
            }
        }
    }

    public int getInteger(String message, int minValue, int maxValue) {
        while(true) {
            System.out.println(message);
            String text = enterText();
            if (text.matches("^[\\d]+$")) {
                int result = Integer.parseInt(text);
                if (result <= minValue || result > maxValue) {
                    System.out.println("Enter incorrect value");
                } else {
                    return result;
                }
            } else {
                System.out.println("You entered not a number");
            }
        }
    }

    public int getInteger() {
        while(true) {
            String text = enterText();
            if (text.matches("^[\\d]+$")) {
                return Integer.parseInt(text);
            } else {
                System.out.println("You entered not a number");
            }
        }
    }

    public void showMenu(boolean isTeacher) {
        System.out.println("1) Show journal");
        System.out.println("2) Show average mark by subject");
        System.out.println("3) Show average mark by student");
        if (isTeacher) {
            System.out.println("4) Add student");
            System.out.println("5) Add mark");
            System.out.println("6) Exit");
        } else {
            System.out.println("4) Exit");
        }
    }


}
