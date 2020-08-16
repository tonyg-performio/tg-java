package com.tony.java.lambda;

import com.tony.java.polymorphism.Dog;

public class GreetingServiceTest {
    
    public static void main(String[] args) {
        int a = 5;
        Dog d = new Dog();
        
        GreetingService greetingService = (names) -> System.out.println("Hi " + names);
        greetingService.greet("tg");
    }
}
