package com;

import java.util.Scanner;
public class FibonacciSeries_T2 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int arr[] = new int[l];

        if (l > 0) {

              if (l == 1) {
                System.out.println(0);
              }
              else {
                arr[0] = 0;
                arr[1] = 1;
                System.out.print(arr[0] + " " + arr[1] + " ");
                for (int i = 2; i < arr.length; i++) {
                    arr[i] = arr[i - 1] + arr[i - 2];

                    System.out.print(arr[i] + " ");
                }
            }

        }
    }
}