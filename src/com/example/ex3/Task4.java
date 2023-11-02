package com.example.ex3;

public class Task4 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 100; i++){
            if(i%2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of all even numbers from 1 to 100 is: " + sum);
    }
}