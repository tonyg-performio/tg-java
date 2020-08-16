package com.tony.java.lambda;

import java.util.Objects;

public class MethodReferencesBooleanTest {
    
    public static void main(String[] args) {
        
        OperationsBoolean op3 = Objects::isNull;
        
        System.out.println(op3.accept(null));
        
        System.out.println(op3.accept("string"));
    }
}
