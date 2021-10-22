package com.company;

public class SearchApp {
    public static int search(int[] arr, int item) {//O(n)
        for (int i = arr.length - 1; i >= 0; i++) {
            if (arr[i] == item)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7, 8};
        System.out.println(binarySearch(array, 3));
    }

    public static int binarySearch(int[] arr, int item) {//O(log(n))
        /**
         * 1,2,3,4,5,6,7,8,9,10
         * search 9
         * check 1-10, low is 1 and high is 10
         * check low to mid-1 and mid+1 to high
         * find mid-position. check if item is smaller, greater or equal to mid
         * if 9 is greater than mid, then go from 6-10
         * take mid of 6-10, which is 8
         * check from 8-10, mid is 9
         * return mid
         * 12-13-14-15-16-17 search 13
         * check 12-17,
         * mid is 15
         * CHECK 12-14
         * mid is 13, return mid
         * if in any situation low is gt high, return -1
         * cormen algos
         */
        int low = 0, high = arr.length - 1, mid;
        if (low > high) {
            return -1;
        }
        //int[] array = {1, 2, 3, 5, 6, 7, 8};
        while (low <= high) {
            mid = (low + high) / 2;
            if (item == arr[mid]) {
                return mid;
            }
            if (item > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}