package com.bridgeLabz.Day5_FuntionalProblems;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of  M rows:- ");
    int m = sc.nextInt();
    System.out.print("Enter the length of  N cons:- ");
    int n = sc.nextInt();
    int a[][] = new int[m][n];
    System.out.print("Enter " +m*n +" Elements to Store in Array :\n");
      for( int i = 0; i < m; i++)
       {
        for (int j = 0; j < n; j++) {
            a[i][j] = sc.nextInt();
          }
       }
        System.out.print("Elements in Array are :\n");
          for(int i = 0; i < m; i++)
          {
        for (int j = 0; j < n; j++) {
            System.out.println("Row [" + i + "]:  Column [" + j + "] :" + a[i][j]);
             }

        }
    }
}
