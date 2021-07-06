package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRday1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);



        /* Declare second integer, double, and String variables. */
        int num;
        double dNum;
        String str;

        /* Read and save an integer, double, and String to your variables.*/
        System.out.println("Enter an Integer: ");
        num = scan.nextInt();
        System.out.println("Enter a decimal number: ");
        dNum = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter text: ");
        str = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        int sum = num + i;
        System.out.println(sum);
        /* Print the sum of the double variables on a new line. */
        double sumDub = dNum + d;
        System.out.println(sumDub);
        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
        System.out.println(s + str);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        scan.close();
    }
}