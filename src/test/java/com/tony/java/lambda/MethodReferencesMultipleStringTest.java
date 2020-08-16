package com.tony.java.lambda;

public class MethodReferencesMultipleStringTest {
    
    public static void main(String[] args) {
        
        MultipleStringOperations op1 = String::concat;
        
        System.out.println(op1.accept("pasta", "delicious"));
    }
}
