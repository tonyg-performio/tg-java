package com.tony.java.polymorphism;

import java.awt.geom.Area;

public class overloadingTest {
    
    public static void main(String[] args) {
        
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Square Area " + areaCalculator.getArea(2));
        System.out.println("Square Double Area " + areaCalculator.getArea(7.5));
        System.out.println("Rectangle Area " + areaCalculator.getArea(8, 5));
    }
}
