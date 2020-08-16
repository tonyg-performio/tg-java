package com.tony.java.lambda;

import com.tony.java.polymorphism.Dog;

public class GreetingServiceTest {
    
    public static void main(String[] args) {
        int a = 5;
        Dog d = new Dog();
    
        //Type of the method defined in the interface determines. Commenting to avoid failures during other test execution
        //GreetingService greetingService = (names) -> System.out.println("Hi " + names);
        // greetingService.greet("tg");
    }
}
