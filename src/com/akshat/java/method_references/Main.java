package com.akshat.java.method_references;

public class Main {

    public static void main(String[] args) {

        Square s = new Square(2);
        
        Shapes shape1 = (Square square) -> {
        	return square.calculateArea();
        };
        
        Shapes shape2 = Square::calculateArea;

        System.out.println("Area 1: " + shape1.getArea(s));
        System.out.println("Area 2: " + shape2.getArea(s));
    }

}
