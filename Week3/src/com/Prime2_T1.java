package com;
import java.util.Scanner;
public class Prime2_T1 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count=0;
        int n = in.nextInt();
        for(int i=1; i<=n;i++){
            if(n%i==0)
                count++;
        }
        if(count==2)
        {
            System.out.println("is prime ");
        }
        else
            System.out.println("is not prime ");

    }
}
