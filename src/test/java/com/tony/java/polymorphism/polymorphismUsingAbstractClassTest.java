package com.tony.java.polymorphism;

public class polymorphismUsingAbstractClassTest {
    
    /**
     * Main method to call test method of Animals
     * @param args
     */
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        testAnimal(animal1);
        
        Animal animal2 = new Cat();
        testAnimal(animal2);
        
        Animal animal3 = new Horse();
        testAnimal(animal3);
        
    }
    
    /**
     * Tests whether each animal makes a sound according to sounds defined in makeSound
     * @param animal Animal object initialized with respective types
     */
    public static void testAnimal(Animal animal){
        animal.makeSound();
        animal.walk();
    }
 
    
}
