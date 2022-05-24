package com.bridgeLabz.Day5_FuntionalProblems;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();

        delta(a, b, c);
    }
    static void delta(int a, int b, int c){
        double delta = Math.pow(b, 2) - 4*a*c;
        double root1 = ((-1)*b + Math.sqrt(delta))/(2*a);
        double root2 = ((-1)*b - Math.sqrt(delta))/(2*a);

        System.out.println("The value of root1 is "+root1);
        System.out.println("The value of root2 is "+root2);

    }

}   
