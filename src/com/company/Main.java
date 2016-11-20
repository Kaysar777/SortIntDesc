package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter integers: ");
        int[] userInts = getIntegers();

        System.out.println();

        System.out.println("na4alnyi massiv:");
        printArray(userInts);
        System.out.println();

        int[] otsort = sortIntegers(userInts);
        System.out.println("otsortirovannyi massiv:");
        printArray(otsort);

    }

    public static int[] getIntegers() {
        int[] integers = new int[5];

        for(int i = 0; i < 5; i++) {
            integers[i] = scanner.nextInt();
        }
        return integers;
    }

    public static void printArray(int[] massiv) {
        for(int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
    }

    public static int[] sortIntegers(int[] massiv) {
        int[] sortedIntegers = new int[massiv.length];
        int temp = 0;

        for(int i = 0; i < massiv.length; i++) {
            if (i == 0) {
                sortedIntegers[i] = massiv[i];
            } else {
                if (massiv[i] > sortedIntegers[i - 1]) {
                    //pervaya postanovka
                    temp = sortedIntegers[i - 1];
                    sortedIntegers[i - 1] = massiv[i];
                    sortedIntegers[i] = temp;

                    //cikl na rasstanovku
                    int newpos = i-1;
                    while(newpos != 0){
                        if (sortedIntegers[newpos] > sortedIntegers[newpos - 1]) {
                            temp = sortedIntegers[newpos - 1];
                            sortedIntegers[newpos - 1] = sortedIntegers[newpos];
                            sortedIntegers[newpos] = temp;
                        }
                        newpos--;
                    }
                }
                else{
                    sortedIntegers[i] = massiv[i];
                }



            }
        }
        return sortedIntegers;
    }
}
