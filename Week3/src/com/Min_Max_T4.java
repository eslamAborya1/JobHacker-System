package com;
import java.util.Scanner;
public class Min_Max_T4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i< arr.length;i++)
        {
            arr[i]=in.nextInt();

        }
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(max < arr[i]) {
                max = arr[i];
            }
            else if(min>arr[i])
            {
                min=arr[i];
            }

        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);

    }
}
