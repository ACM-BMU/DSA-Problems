package com.company;

/**
 * number with repetitive digit. find repetitive digit and maximum occurrence of it
 * 12345, print(-1)
 * 12343, print(3 and 2) number, occurrence
 * 1234323, print (3,3)
 * 123432, print (3, 2) first repetitive occurrence
 */
public class Application2 {
    public static void print(int n) {
        int[] array = new int[10];
        int temp = n;
        while (temp > 0) {
            array[temp % 10]++;
            temp = temp / 10;
        }
        //compare
        int max = Integer.MIN_VALUE;
        int pos = -1;
        for (int i = 0; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
                pos = i;
            }
        }
        System.out.println("max occurred number is: " + pos + " with frequency: " + max);
    }

    public static void main(String[] args) {
       print(123432);
    }
}

