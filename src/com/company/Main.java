package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double a,b,c;
        double solution1, solution2;
        Scanner sc = new Scanner(System.in);

        System.out.println("This is a program to solve a Quadratic Equation ax(2)+bx+c=0 given the three parameter values");
        System.out.println("Enter value for a");
        a=sc.nextDouble();
        System.out.println("Enter value for b");
        b=sc.nextDouble();
        System.out.println("Enter value for c");
        c=sc.nextDouble();
        sc.close();

        double DM = b*b - 4*a*c;
        solution1 = (-b + (Math.sqrt((DM)))) / (2 * a);
        solution2 = (-b - (Math.sqrt((DM)))) / (2 * a);

        if (a==0)
        {
            System.out.println("This is not a Quadratic Equation! Exiting Program");
        }
        else {

            if ((DM)<0)
            {
                System.out.println("The Solution to the Quadratic Equation is A Complex Number! Exiting Program");
            }
            if ((DM)==0)
            {
                System.out.println("There is only one solution to the Quadratic equation - "+solution1);
            }
            else{
            System.out.println("The solutions to the Quadratic equation are " + solution1 + " or " + solution2);

        }
    }
    }
}
