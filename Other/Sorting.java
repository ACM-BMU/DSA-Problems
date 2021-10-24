package com.company;

public class Sorting {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {13, 7, 8, 91, 75, 24, 61, 55, 12};
       // bubbleSort(arr);
       // selectionSort(arr);
        insertionSort(arr);
    }

    /**
     * sorting algorithm, random elements of n numbers; enter array as input and print sorted array;
     * bubble and selection sort and insertion sort O(n^2)
     */

    public static void bubbleSort(int[] arr) {
        int temp1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp1 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp1;
                }
            }
        }
        System.out.println("sorted array: ");
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void selectionSort(int[] arr) {  //{13, 7, 8, 91, 75, 24, 61, 55, 12};
        int minimum, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            minimum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j]<arr[minimum]){
                    minimum=j;
                }
            }
            temp=arr[minimum];
            arr[minimum]=arr[i];
            arr[i]=temp;
        }

        System.out.println("sorted array: ");
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void insertionSort(int[] arr){
        int temp;
        int length = arr.length;
            for (int j = 1; j < length; j++) {
                for (int k = 0; k<j ; k++) {
                    if(arr[j]<arr[k]){
                        temp=arr[j];
                        arr[j]=arr[k];
                        arr[k]=temp;
                    }
                }
            }

        System.out.println("sorted array: ");
        for (int j : arr) {
            System.out.println(j);
        }
    }

}
