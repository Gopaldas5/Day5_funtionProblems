package com.bridgeLabz.Day5_FuntionProblems;

import java.util.Scanner;

public class WindChill {
    static void wind(int t, int v){
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75)*(Math.pow(v, 0.16));
        System.out.println("Wind chill is "+w);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter temperature T ");
        System.out.println("Please note Range of t is 0 to 50");
        int t = sc.nextInt();
        System.out.println("Please enter the value of  wind speed V ");
        System.out.println("Please note Range of v is 3 to 120");
        int v = sc.nextInt();

        wind(t, v);
    }
}
