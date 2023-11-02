package com.example.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {

        double a, b, c, x1, x2, delta;
        char roots = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program will calculate the roots of a quadratic equation");
        System.out.println("Enter the value of a:");
        a = Double.parseDouble(br.readLine());

        if(a == 0){
            System.out.println("The value can either be a negative or positive but not a zero");
        } else {
            System.out.println("Enter the value of b:");
            b = Double.parseDouble(br.readLine());
            System.out.println("Enter the value of c:");
            c =Double.parseDouble(br.readLine());

            delta = Math.pow(b,2) - 4*a*c;

            if(delta < 0) roots = 0;
            if(delta == 0) roots = 1;
            if(delta > 0) roots = 2;

            switch(roots){
                case 0:
                System.out.println("There are no real roots");
                break;
                case 1:{
                    x1 = -b/(2*a);
                    System.out.printf("a = " + "%4.2f,\n",a);
                    System.out.printf("b = " + "%4.2f,\n",b);
                    System.out.printf("c = " + "%4.2f,\n",c);
                    System.out.print("The root for this is: ");
                    System.out.printf("%4.2f,\n",x1);
                }break;
                case 2:{
                    x1 = (-b + Math.sqrt(delta))/(2*a);
                    x2 = (-b - Math.sqrt(delta))/(2*a);
                    System.out.printf("a = " + "%4.2f,\n",a);
                    System.out.printf("b = " + "%4.2f,\n",b);
                    System.out.printf("c = " + "%4.2f,\n",c);
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f,\n", x1);
                    System.out.print("x2 = ");
                    System.out.printf("%4.2f,\n", x2);
                }break;
            }
        }
    }
}