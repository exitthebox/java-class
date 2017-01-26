package com.kimmitt;

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

    public  static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static void main(String[] args) {
        //second lesson
        int[] myIntegers = getIntegers(6);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("element " + i +", typed value sas " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

	// first lesson below
//        int[] myIntArray = new int[10];//specify the number of elements in the array when defining it
//        myIntArray[5] = 50;//specify single element value
//
//        double[] myDoubleArray = new double[10];
//        double[] myOtherDoubleArray = { 1.1, 1.2 };
//
//        //System.out.println(myOtherDoubleArray[0]);
//
//        int j = 100;
//
//        int[] myOtherIntArray = new int[j];
//
//        for(int i=0; i<myOtherIntArray.length; i++){
//            myOtherIntArray[i] = i*10;
//        }
//        printArray(myOtherIntArray);//don't need to specify the [] brackets, just the name
//
//    }
//
//    public static void printArray(int[] array){
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("element " + i + ", value is " + array[i]);
//        }


    }
}
