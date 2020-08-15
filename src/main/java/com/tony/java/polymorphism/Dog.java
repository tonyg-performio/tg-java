package com.tony.java.polymorphism;

public class Dog extends Animal{
    
    @Override
    public void makeSound(){
        System.out.println("I am a barking dog");
    }
    
    public void walk(){
        System.out.println("I am walking ");
    }
}
