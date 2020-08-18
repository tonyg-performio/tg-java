package com.tony.java.assignment1;

public class CalculatorTest {
    
    public static void main(String[] args) {
        System.out.println("Starting Calculator");
        
        //Defining lambda for a math operations
        MathOperation add = (num1, num2) -> num1 + num2;
        MathOperation subtract = (num1, num2) -> num1 - num2;
        MathOperation multiply = (num1, num2) -> num1 * num2;
        MathOperation divide = (num1, num2) -> num1 / num2;
        
        // Find the output of 5+2-3*7+2/3
        int onScreenNumber = 0;
        
        onScreenNumber = calculate(5, add, 2);
        onScreenNumber = calculate(onScreenNumber, subtract, 3);
        onScreenNumber = calculate(onScreenNumber, multiply, 7);
        onScreenNumber = calculate(onScreenNumber, add, 2);
        onScreenNumber = calculate(onScreenNumber, divide, 3);
        
        System.out.println(onScreenNumber);
    }
    
    /**
     * Method with data and call to interface
     *
     * @param mathOperation
     *         Receives lambda from the main method
     *
     * @return Result of the lambda
     */
    private static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber) {
        return mathOperation.operate(onScreenNumber, enteredNumber);
    }
}
