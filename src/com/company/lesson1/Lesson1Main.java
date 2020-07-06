package com.company.lesson1;

import com.company.lesson1.abstr.AbstractFigure;
import com.company.lesson1.abstr.Box;
import com.company.lesson1.abstr.Circle;
import com.company.lesson1.cars.BMW;
import com.company.lesson1.cars.Costable;
import com.company.lesson1.cars.Mercedes;
import com.company.lesson1.interf.Areable;
import com.company.lesson1.interf.Box1;
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


        System.out.println("Interfaces");
        Areable[] areables = new Areable[2]; // array of LINKS
        areables[0] = new Box1(10);
        areables[1] = new Box1(20);
        getAreas(areables);

        // Interface example

        Costable[] costables = new Costable[2]; // array of LINKS
        costables[0] = new BMW();
        costables[1] = new Mercedes();
        method(costables);
    }

    static void method(Costable[] costables) {
        for (Costable costable : costables) {
            System.out.println("Car cost is " + costable.getCost());
        }
    }

    static void getAreas(AbstractFigure[] figures) {
        for (AbstractFigure abstractFigure : figures) {
            System.out.println("Box1 color - " + abstractFigure.getColor() + " and area - " + abstractFigure.area());
        }
    }

    static void getAreas(Areable[] figures) {
        for (Areable abstractFigure : figures) {
            System.out.println("Box1 area - " + abstractFigure.area());
        }
    }

}
