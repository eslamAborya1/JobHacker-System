package com;
import java.util.Scanner;
public class Prime {

// is a solve without loop
        public static void main(String[] args) {

            Scanner in =new Scanner(System.in);
            int n=in.nextInt();
            if(n>1){
                if(n==3 ){
                    System.out.println("Prime");
                }

                else if(n%2!=0 || n==2){
                    if(n%3!=0 && n%1==0)
                        System.out.println("Prime");
                    else
                        System.out.println("Not Prime");
                }
                else
                    System.out.println("Not Prime");
            }
            else
                System.out.println("Not Prime  ");
        }
    }

