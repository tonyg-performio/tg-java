package com.tony.java.assignment1;

public class MathOperationTest {
    
    public static void main(String[] args) {
        System.out.println("Starting Calculator");
        
        //Defining lambda for a math operations
        MathOperation add = (num1, num2) -> num1 + num2;
        MathOperation subtract = (num1, num2) -> num1 + num2;
        MathOperation multiply = (num1, num2) -> num1 + num2;
        MathOperation divide = (num1, num2) -> num1 + num2;
        
        System.out.println("Add " + calculate(add));
        System.out.println("Subtract " + calculate(subtract));
        System.out.println("Multiply " + calculate(multiply));
        System.out.println("Divide " + calculate(divide));
        
        System.out.println("Finished calculation");
    }
    
    /**
     * Method with data and call to interface
     *
     * @param mathOperation
     *         Receives lambda from the main method
     *
     * @return Result of the lambda
     */
    private static int calculate(MathOperation mathOperation) {
        int a = 5;
        int b = 7;
        return mathOperation.operate(a, b);
    }
}
