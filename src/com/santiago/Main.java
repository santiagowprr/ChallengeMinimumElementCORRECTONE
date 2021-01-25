package com.santiago;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count){
        System.out.println("Insert " + count + " integers.");
        int[] userArray = new int[count];
        for (int i=0; i<count; i++){
            userArray[i] = scanner.nextInt();
        }
        return userArray;
    }

    public static int findMin(int[] array){
        int[] tempArray = new int[array.length];
        for (int i=0; i<array.length; i++){
            tempArray[i] = array[i];
        }
        Arrays.sort(tempArray);
        return tempArray[0];

    }

    public static void main(String[] args) {
        System.out.println("Enter the length of your array");
        System.out.println("The min value is " + findMin(readIntegers(scanner.nextInt())));
    }

}
