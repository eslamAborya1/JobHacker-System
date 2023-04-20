package com;
import java.util.Scanner;
public class common_elements_T8 {


        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int a = in.nextInt();
                int arr1[] = new int[a];
                for (int i = 0; i < arr1.length; i++) {
                        arr1[i] = in.nextInt();
                }

                int b = in.nextInt();
                int arr2[] = new int[b];
                for (int i = 0; i < arr2.length; i++) {
                        arr2[i] = in.nextInt();
                }
                int min=0;
                if(a>b) {
                        min=b;
                }
                else{
                        min=a;
                }
                int arr3[] = new int[min];

                int index=0;
                for (int i = 0; i < arr1.length; i++) {
                        for (int j =0 ; j < arr2.length; j++) {
                                if(arr1[i]==arr2[j])
                                {
                                         arr3[index]=arr1[i];
                                         index++;
                                         break;

                                }

                        }
                }
                for (int i = 0; i < index; i++) {
                        System.out.println(arr3[i]);
                }

        }
}