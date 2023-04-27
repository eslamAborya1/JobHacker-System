package com;
import java.util.Scanner;
public class SecondLargestNumber_T9 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int arr[]=new int[a];
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1; j< arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=0;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Second Large number is : "+arr[1]);
    }
}
