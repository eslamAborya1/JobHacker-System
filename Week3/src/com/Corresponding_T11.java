package com;
import java.util.Scanner;
public class Corresponding_T11 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
         int a = in.nextInt();
         int arr1[]=new int[a];
         for(int i=0;i<arr1.length;i++)
         {
             arr1[i]=in.nextInt();
         }

         int b =in.nextInt();
         int arr2[]=new int[b];
         for(int i=0; i<arr2.length; i++)
         {
             arr2[i]=in.nextInt();
         }
         if(a!=b)
         {
             System.out.println("Sorry Length of two arrays must be equal");
         }
         else {

             int index=0;
             int arr3[]=new int[a];

             for(int i=0;i<arr1.length;i++){

                 for(int j=i; j<arr2.length;j++)
                 {  int sum=0;
                    sum= arr1[i]+arr2[j];
                    arr3[index]=sum;
                    index++;
                    break;
                 }
             }
             for(int i=0; i<arr3.length;i++)
             {
                 System.out.print(arr3[i]+" ");
             }
         }



    }
}