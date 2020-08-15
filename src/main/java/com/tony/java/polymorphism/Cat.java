package com.tony.java.polymorphism;

public class Cat extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("I am a cat");
    }
    
    public void walk() {
        System.out.println("I am walking ");
    }
}
