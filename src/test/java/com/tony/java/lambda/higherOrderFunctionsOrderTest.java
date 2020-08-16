package com.tony.java.lambda;

public class higherOrderFunctionsOrderTest {
    
    public static void main(String[] args) {
        System.out.println("Starting execution");
        
        //Executing a lambda in the main function
        TestHigherOrderFunction((string) -> {
            System.out.println("Inside lambda");
            return string.toUpperCase();
        });
        
        //Invoking a lambda by passing data
        System.out.println(getLambda().greet("print me in caps"));
        
        System.out.println(getLambdaDirectly().greet("print me in caps"));
        
        System.out.println("Ending execution");
    }
    
    private static int getNumber() {
        System.out.println("Get Number");
        return 5;
    }
    
    private static void receiveNumber(int i) {
        System.out.println("Received  number is " + i);
    }
    
    private static void TestHigherOrderFunction(GreetingService greetingService) {
        System.out.println("Inside test method. Received greeting service");
        String greetings = greetingService.greet("challenges");
        System.out.println(greetings);
    }
    
    //Function as first class object
    private static GreetingService getLambda() {
        GreetingService greetingService = (s) -> s.toUpperCase();
        return greetingService;
    }
    
    //Returning function
    private static GreetingService getLambdaDirectly() {
        return (s) -> s.toUpperCase();
    }
}
