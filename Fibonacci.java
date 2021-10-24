package com.company;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // write your code here
        // alt+shift+r = refactor rename
        //System.out.println("13: "+ isFibonacci(13));
        //System.out.println("8: "+ isFibonacci(8));
        //System.out.println("5: "+ isFibonacci(5));
        //System.out.println("25: "+ isFibonacci(25));
       /**
         * input two max and min numbers, as in get a  range.
         * iterate from min to max
         * find :
         *  1. all armstrong numbers: eg 153=1^3+5^3+3^3, each digit cubes and add gives the number
         *  2. prime nos.
         *  3. krishnamurti nos. eg 145 = 1!+4!+5!
         *  4. perfect numbers eg. 28 = 1+2+4+7+14, sum of unique factors
         * add choice, to print either of 4 numbers,
         * switch case numbers 1-4 default enter proper choice
         * give programmer flexibility to continue till he wants
         */
        Scanner sc = new Scanner(System.in);
        String response = "";
        do {
            System.out.println("Enter your number.. ");
            int input = sc.nextInt();
            System.out.println("Input " + input + ": " + isFibonacci(input));
            System.out.println("Do you want to exit? press Y for yes, N for No");
            response = sc.next();
        } while (!"Y".equalsIgnoreCase(response));
    }

    /**
     * This is documentation comment (/ * * + enter key)
     * 0,1,1,2,3,5,8,13,...
     * n: input number
     * n if Fibonacci iff 5*n^2+4 or 5*n^2-4 is a perfect square
     */
    public static boolean isFibonacci(int n) {
        return (isPerfectSquare(5 * n * n + 4)) || (isPerfectSquare(5 * n * n - 4));
    }

    private static boolean isPerfectSquare(int m) {
        int result = (int) Math.floor(Math.sqrt(m));
        return (result * result == m);
    }
}
