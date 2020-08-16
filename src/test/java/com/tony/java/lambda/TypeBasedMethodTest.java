package com.tony.java.lambda;

public class TypeBasedMethodTest {
    
    public static void main(String[] args) {
        
        TypeBasedMethod typeBasedMethod = (name) -> name.toUpperCase();
        System.out.println(typeBasedMethod.Name("tony"));
    }
}
