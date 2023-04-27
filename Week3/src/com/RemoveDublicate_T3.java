package com;

import java.util.Scanner;

public class RemoveDublicate_T3 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int temp=0,count=0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {

                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
        }
        for(int i=0;i<arr.length-count/2;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
