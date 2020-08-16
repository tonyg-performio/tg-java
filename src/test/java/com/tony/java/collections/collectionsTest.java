package com.tony.java.collections;

import java.util.ArrayList;
import java.util.List;

public class collectionsTest {
    
    /**
     * Finding highest number using different methodologies
     */
    public static void main(String[] args) {
        
        int[] array = { 90, 2, 3, -700, 4, 5, 0, 6, 7, 83 };
        
        highestNumber(-1, 8, 5);
        
        highestNumber(array);
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(-9);
        list.add(10);
        list.add(2);
        
        highestNumber(list);
    }
    
    /**
     * Method accepting parameters of numbers and finding the highest among them
     */
    private static void highestNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Parameters - Highest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("Parameters - Highest number is " + b);
        } else {
            System.out.println("Parameters - Highest number is " + c);
        }
    }
    
    /**
     * Finding the highest number when values are passed as an array
     *
     * @param array
     *         Integer array of numbers ranging from negative to positive
     *         Size of the array is fixed
     */
    private static void highestNumber(int[] array) {
        
        int highest = array[0];
        for (int i = 0; i < array.length; i++) {
            
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        System.out.println("Array - Highest is " + highest);
    }
    
    /**
     * Finding highest number in the list
     *
     * @param list
     *         Defined as a integer type list and receives the list defined in main method
     */
    private static void highestNumber(List<Integer> list) {
        int highest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            
            if (list.get(i) > highest) {
                highest = list.get(i);
            }
        }
        System.out.println("List - Highest is " + highest);
    }
}
