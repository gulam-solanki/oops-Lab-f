/*Develop a program that accepts an initial amount of money (called the principal), a simple annual interest rate, and a number 
of months will compute the balance at the end of that time. Assume that no additional deposits or withdrawals are made and that a 
month is 1/12 of a year. Total interest is the product of the principal, the annual interest rate expressed as a decimal, and the 
number of years. */

// package Lab 7;

import java.util.Scanner;

public class P1_CalculateInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principal amount : ");
        double principal = sc.nextDouble();

        System.out.println("enter annual interest rate : ");
        double interest = sc.nextDouble();

        System.out.println("enter months : ");
        double month = sc.nextDouble();

        double totalInterest = principal*(interest/100)*(month/12);
        System.out.println("Total interest : "+totalInterest);

        double finalAmount = principal + totalInterest;
        System.out.println("Updated amount : "+ finalAmount);

    }
}
