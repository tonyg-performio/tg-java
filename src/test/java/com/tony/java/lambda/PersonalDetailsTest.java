package com.tony.java.lambda;

public class PersonalDetailsTest {
    
    public static void main(String[] args) {
        PersonalDetails personalDetails = ((FirstName, SecondName, Age) -> {
            System.out.println("My name is " + FirstName + " " + SecondName);
            System.out.println("Age " + Age);
        });
        personalDetails.details("Tony", "George", 32);
    }
}
