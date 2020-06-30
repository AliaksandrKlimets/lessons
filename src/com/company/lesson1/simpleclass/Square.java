package com.company.lesson1.simpleclass;

//Simple class square
public class Square {

    // Fields list of this class, fields located before constructor
    // Each field signature is (type name) (variable name)
    // Access modifiers are optional, 4 types
    // 1) private - only in class
    // 2) package-private (without) - only in package
    // 3) protected - in package + in extended classes
    // 4) public - everywhere

    private int size;

    // Constructor - special method which used on object creation. Constructor doesn't return any value, the name the same as class name
    // There we have 2 constructors, they are overloaded

    public Square() {
    }

    public Square(int size) {
        this.size = size; // this - link to current object
    }

    // Get/Set methods called accessors, the used to have an access to variables inside the class

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Methods which provides some logic inside the class

    public int perimeter() {
        return 4 * this.size;
    }
}
