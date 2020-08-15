package com.tony.java.polymorphism;

public class polymorphismTest {
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Horse horse = new Horse();
        testDog(dog);
        testCat(cat);
        testHorse(horse);
    }
    
    public static void testDog(Dog g){
        g.makeSound();
        g.walk();
    }
    
    public static void testCat(Cat c){
        c.makeSound();
        c.walk();
    }
    
    //carries value for sound from Animal class as horse extends animal
    public static void testHorse(Horse h){
        h.makeSound();
        h.walk();
    }
    
}
