/**
 * Program to calculate mortgage.
 * input time, annual rate and principal amount
 * return mortgage value in currency formats using NumberFormat class
 * M = (P * r * (1 + r)^n) / ((1 + r)^n - 1)
 * M = mortgage, n = number of payments (Years * 12), r = monthly rate, P = principal amount
 */
package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int principal;
        double annualInterestRate;
        int period;

        Scanner sc = new Scanner(System.in);
        System.out.print("Principal amount: ");
        principal = sc.nextInt();
        System.out.print("Annual Rate in percentage: ");
        annualInterestRate = sc.nextDouble();
        System.out.print("Time in years: ");
        period = sc.nextInt();

        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfPayments = period * 12;
        double mortgage = (principal * monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        NumberFormat finalMortgage = NumberFormat.getCurrencyInstance();
        System.out.println(finalMortgage.format(mortgage));
    }
}
