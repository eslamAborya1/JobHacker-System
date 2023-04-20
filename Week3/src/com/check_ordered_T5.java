package com;
import java.util.Scanner;
public class check_ordered_T5 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=in.nextInt();

        }
        boolean bool=true;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    bool= false;
                }
            }

        }
        if(bool==false) {
            System.out.println("Not in ascending order");
        }
        else {
            System.out.println("in ascending order");
        }



    }
}
