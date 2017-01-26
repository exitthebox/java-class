package com.kimmitt;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);//java class Scanner specifying System.in for system input

    public static int[] getIntegers(int numbers){
        System.out.println("Enter " + numbers + " integer values.\r");
        int[] values = new int[numbers];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] sortIntegers(int[] array){

        Arrays.sort(array);
        return array;
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        //return Arrays.sort(array);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " contents " + array[i]);
        }
    }


    public static void main(String[] args) {
	// write your code here

        int[] myIntegers = getIntegers(5);
        sortIntegers(myIntegers);
        printArray(myIntegers);
    }
}
