package com.bridgeLabz.Day5_FuntionalProblems;

import java.util.Scanner;

public class Distance {
    public static void main(String arg[])

    {
        int x1,y1;
        double dis;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1 point:- ");
        x1=sc.nextInt();
        System.out.println("enter y1 point:- ");
        y1=sc.nextInt();
        dis= Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        System.out.println("Distance between to point:- "+"("+x1+","+y1+") is:-  "+dis);

    }
}
