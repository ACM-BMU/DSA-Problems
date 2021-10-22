package com.company;

import java.util.Scanner;
import java.lang.Math;

/**
 * input two max and min numbers, as in get a  range.
 * iterate from min to max
 * find :
 * 1. all armstrong numbers: e.g. 153=1^3+5^3+3^3, each digit cubes and add gives the number
 * 2. prime nos.
 * 3. krishnamurti nos. e.g. 145 = 1!+4!+5!
 * 4. perfect numbers e.g. 28 = 1+2+4+7+14, sum of unique factors
 * add choice, to print either of 4 numbers,
 * switch case numbers 1-4 default enter proper choice
 * give programmer flexibility to continue till he wants
 */
public class Main {

    public static void main(String[] args) {
        starter();
        Scanner sc = new Scanner(System.in);
        gameHost(sc);
    }

    //functions for limits
    public static int lowerLimit(Scanner sc) {
        int low;
        System.out.println("Give lower limit: ");
        low = sc.nextInt();
        return low;
    }

    public static int upperLimit(Scanner sc) {
        int up;
        System.out.println("Give upper limit: ");
        up = sc.nextInt();
        return up;
    }

    //Starter
    public static void starter() {
        System.out.println("This game will find all the numbers which specify a criteria in a range that is given by you!");
        System.out.println("There are 4 types of criteria in this program");
        System.out.println("1st is Prime Number, a number divisible by one and itself. Eg 7");
        System.out.println("2nd is Armstrong Number, a number in which sum of cubes of digits gives the number. Eg 153");
        System.out.println("3rd is Krishnamurti's Number, a number in which sum of factorial of digits gives the number. Eg 145");
        System.out.println("4th is Perfect Number, a number that is sum of its unique factors. Eg 28");
        System.out.println(" ");
    }

    //Game Host
    public static void gameHost(Scanner sc) {
        //makes the user control the UI
        char wantToContinue;
        do {
            int lower = lowerLimit(sc);
            int upper = upperLimit(sc);
            System.out.println("your range is: [" + lower + "," + upper + "]");
            System.out.println("which number do you want to display?");
            System.out.println("[1] for Prime, [2] for Armstrong, [3] for Krishnamurti's, [4] for Perfect Prime");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> printPrime(lower, upper);
                case 2 -> isArmstrong(lower, upper);
                case 3 -> isKrishnamurti(lower, upper);
                case 4 -> isPerfect(lower, upper);
                default -> System.out.println("Wrong choice");
            }
            System.out.println("Do you want to continue? Y for yes");
            wantToContinue = sc.next().charAt(0);//gets char at 0 index in string
        } while ('Y' == wantToContinue);
    }

    //Prime Numbers
    public static void printPrime(int lower, int upper) {
        System.out.println("all prime numbers in range are now getting printed...");
        int count = 0;
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("total number of prime numbers are: " + count);
    }

    public static boolean isPrime(int b) {
        for (int j = 2; j <= Math.sqrt(b); j++) {
            if (b % j == 0) {
                return false;
            }
        }
        return true;
    }

    //Armstrong Number
    public static void isArmstrong(int lower, int upper) {
        int counter = 0;
        System.out.println("Armstrong numbers in range [" + lower + "," + upper + "] are: ");
        for (int i = lower; i <= upper; i++) {
            if (armCheck(i)) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("total number of Armstrong number in given range is: " + counter);

    }

    public static boolean armCheck(int number) {//number is i
        int n = order(number);//n is order
        int m;
        int var = number;//var is temporary variable
        double sum = 0;
        while (var > 0) {
            m = var % 10;
            sum = sum + Math.pow(m, n);
            var = var / 10;
        }
        return sum == number;
    }

    public static int order(int num) { //num is number order is order
        int order = 0;
        while (num > 0) {
            order++;
            num = num / 10;
        }
        return order;
    }

    //Krishnamurti Number
    public static void isKrishnamurti(int lower, int upper) {
        int counter = 0;
        for (int i = lower; i <= upper; i++) {
            if (checkKrishna(i)) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("Total Krishnamurti number in range: " + counter);

    }

    public static boolean checkKrishna(int n) {
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            // calculate factorial of last digit
            // of temp and add it to sum
            sum += factorial(temp % 10);
            temp = temp / 10;
        }
        // Check if number is krishnamurthy
        return (sum == n);
    }

    public static long factorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }
        return factorial;
    }

    public static void isPerfect(int lower, int upper) {

        int counter = 0;
        for (int n = lower; n <= upper; n++) {
            if (perfect(n)) {
                System.out.println(n);
                counter++;
            }
        }
        System.out.println("Total perfect number in range are: " + counter);

    }

    public static boolean perfect(int n) {
        if (n==0){
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return (sum == n);
    }
}
