package com;

import java.util.Scanner;

public class consecutive_elements_T13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=0;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       // 3 4 6 6 7 8
        int count=0;
        for(int i=0;i<arr.length;i+=2)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[j]-arr[i]==1)
                {
                    count++;
                }
                break;
            }
        }
        System.out.println(count);

    }
}