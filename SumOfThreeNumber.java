package com.bridgeLabz.Day5_FuntionalProblems;

import java.util.Scanner;

 class SumOfThreeNumber {
     static void findTriplets(int[] arr, int n)
     {
         int count = 0;
         for (int i = 0; i <n -2; i++)
         {
             for (int j = i+1; j < n-1; j++)
             {
                 for (int k = j+1; k < n; k++)
                 {
                     if (arr[i]+arr[j]+arr[k] == 0)
                     {
                         System.out.print(arr[i]);
                         System.out.print(" ");
                         System.out.print(arr[j]);
                         System.out.print(" ");
                         System.out.print(arr[k]);
                         System.out.print(" ");
                          count ++;

                     }
                 }
             }
         }

         System.out.println(count+" triplets found");
     }

     public static void main(String[] args)
     {

         System.out.println("Enter number of array size:- ");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
//             arr[i] =arr.length;
         findTriplets(arr, n);

          }
        }
    }




