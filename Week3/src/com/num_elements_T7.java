package com;
import java.util.Scanner;

public class num_elements_T7 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int n = in.nextInt();

            int arr[]=new int[n];
            for(int i=0;i< arr.length;i++)
            {
                arr[i]=in.nextInt();

            }
            int count=0;
            int value=in.nextInt();

            for(int i=0; i<arr.length;i++)
            {
                if(arr[i]>value)
                { count++;}
            }
            System.out.println("number of elements greater than "+value +": "+count);
        }
    }

