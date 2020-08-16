package com.tony.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencesTest {
    
    public static void main(String[] args) {
        Operations op1 = (s) -> System.out.println("Received string is - " + s);
        
        op1.accept("Method references");
        
        Operations op2 = System.out::println;
        op2.accept("New method reference");
        
        final List<String> list = new ArrayList<>();
        Operations op3 = list::add;
        
        op3.accept("first list item");
        System.out.println(list);
    }
}
