package com.tony.java.dataType;

import java.util.Arrays;

public class ReferenceType {
    
    public static void main(String[] args) {
        
        int array[] = new int[]{1,2,3};
        System.out.println("Array values: " + Arrays.toString(array));
        
        totalSales(array);
        prediction(array);
    }
    
    private static void totalSales(final int[] arrayInMethod){
        System.out.println("Final Sales: " + (arrayInMethod[0]+arrayInMethod[1]+arrayInMethod[2]));
    }
    
    private static void prediction( int[] arrayInPrediction){
    
        arrayInPrediction=Arrays.copyOf(arrayInPrediction,arrayInPrediction.length);
        arrayInPrediction[0]++;
        arrayInPrediction[1]++;
        System.out.println("Predicted Sales: " + (arrayInPrediction[0]+arrayInPrediction[1]+arrayInPrediction[2]));
    }
}
