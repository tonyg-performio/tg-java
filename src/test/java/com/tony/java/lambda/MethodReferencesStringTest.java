package com.tony.java.lambda;

public class MethodReferencesStringTest {
    
    public static void main(String[] args) {
        
        OperationsString op1 = String::toUpperCase;
        
        System.out.println(op1.accept("pasta"));
    }
}
