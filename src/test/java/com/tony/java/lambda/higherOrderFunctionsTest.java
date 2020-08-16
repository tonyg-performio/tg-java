package com.tony.java.lambda;

public class higherOrderFunctionsTest {
    
    public static void main(String[] args) {
        GreetingService greetingService = (gs) -> gs.toUpperCase();
        
        //Passing the object of the interface as parameter after being initialized with the function
        TestHigherOrderFunction(greetingService);
        
        //Passing the function itself as parameter
        TestHigherOrderFunction((gs) -> gs.toUpperCase());
    }
    
    private static void TestHigherOrderFunction(GreetingService greetingService) {
        String greetings = greetingService.greet("challenges");
        System.out.println(greetings);
    }
}
