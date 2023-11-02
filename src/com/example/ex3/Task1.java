package com.example.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {

        float firstNumberLusajo, secondNumberLusajo, sum, difference, product, quotient;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program can compute levels of calculations");
        System.out.println("Enter the first number: ");
        firstNumberLusajo = Float.parseFloat(br.readLine());
        System.out.println("Enter the second number: ");
        secondNumberLusajo = Float.parseFloat(br.readLine());

        sum = firstNumberLusajo + secondNumberLusajo;
        difference = firstNumberLusajo - secondNumberLusajo;
        product = firstNumberLusajo * secondNumberLusajo;
        quotient = firstNumberLusajo / secondNumberLusajo;

        System.out.printf("The first number that was entered is: " + "%2.2f", firstNumberLusajo);
        System.out.printf(" and the second number is: " + "%2.2f", secondNumberLusajo);

        System.out.println();

        System.out.printf("The sum of the two numbers is: " + "%2.2f, \n", sum);
        System.out.printf("The difference between the two numbers is: " + "%2.2f, \n", difference);
        System.out.printf("The product of the two numbers is: " + "%2.2f, \n", product);
        System.out.printf("The quotient resulted from the division of the first number by the second number is: " + "%2.2f, \n", quotient);

    }
}