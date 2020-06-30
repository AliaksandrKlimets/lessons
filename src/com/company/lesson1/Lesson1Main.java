package com.company.lesson1;

import com.company.lesson1.abstr.AbstractFigure;
import com.company.lesson1.abstr.Box;
import com.company.lesson1.abstr.Circle;
import com.company.lesson1.simpleclass.Square;

public class Lesson1Main {

    public static void main(String[] args) {
        System.out.println("Lesson 1"); // hot type - sout + tab = System.out.println

        System.out.println("Simple class example");

        Square square = new Square(); // Use constructor without parameters
        Square square1 = new Square(100); // Use constructor with parameter
        // The same
        // Square square;
        // square = new Square();

        System.out.println("Square size = " + square.getSize());
        System.out.println("Square1 size = " + square1.getSize());

        System.out.println("Square perimeter = " + square.perimeter());
        System.out.println("Square1 perimeter = " + square1.perimeter());

        System.out.println("Abstract inheritance");
        AbstractFigure[] abstractFigures = new AbstractFigure[2]; // array of LINKS
        abstractFigures[0] = new Circle("White", 10);
        abstractFigures[1] = new Box("Black", 20);
        getAreas(abstractFigures);
    }

    static void getAreas(AbstractFigure[] figures) {
        for (AbstractFigure abstractFigure : figures) {
            System.out.println("Figure color - " + abstractFigure.getColor() + " and area - " + abstractFigure.area());
        }

    }

}
