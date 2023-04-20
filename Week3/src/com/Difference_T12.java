package com;
import java.util.Scanner;
public class Difference_T12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int min=arr[0],max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
            {
                min=arr[i];
            }
            else if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max +" - "+ min+" = "+(max-min));
    }
}
