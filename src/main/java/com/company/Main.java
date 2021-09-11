package com.company;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        double euro = Double.parseDouble(scan.nextLine());
        System.out.print("What is the exchange rate? ");
        double rate = Double.parseDouble(scan.nextLine());
        double usdc_rounded = (Math.ceil(euro*rate*100))/100;
        System.out.printf("%.2f euros at an exchange rate of %.4f is \n%.2f U.S. dollars. ", euro, rate, usdc_rounded);
    }
}
