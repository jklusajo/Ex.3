package com.example.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {

        float heightLusajo, weightLusajo, bmi;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This will determine your BMI");
        System.out.println("Please enter your current height in meters:");
        heightLusajo = Float.parseFloat(br.readLine());
        System.out.println("Please enter your current weight in kg:");
        weightLusajo = Float.parseFloat(br.readLine());

        bmi = (float)(weightLusajo / (Math.pow(heightLusajo,2)));
        System.out.printf("Your current BMI is: " + "%2.2f, \n", bmi);

        if(bmi < 16){
            System.out.println("Starvation");
        } else if((bmi >= 16)&&(bmi < 16.99)){
            System.out.println("Emaciation");
        } else if((bmi >= 17)&&(bmi < 18.49)){
            System.out.println("Underweight");
        } else if((bmi >= 18.50)&&(bmi < 22.99)){
            System.out.println("normal, low range");
        } else if((bmi >= 23.00)&&(bmi < 24.99)){
            System.out.println("normal, high range");
        } else if((bmi >= 25.00)&&(bmi < 27.49)){
            System.out.println("Overweight, low range");
        } else if((bmi >= 27.50)&&(bmi < 29.99)){
            System.out.println("Overweight, high range");
        } else if((bmi >= 30.00)&&(bmi < 34.9)){
            System.out.println("1st degree object");
        } else if((bmi >= 35)&&(bmi < 39.9)){
            System.out.println("2nd degree obesity");
        } else if(bmi >= 40){
            System.out.println("3rd degree obesity");
        }
    }
}