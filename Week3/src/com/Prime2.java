package com;
import java.util.Scanner;
public class Prime2 {


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
/*
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


 * */