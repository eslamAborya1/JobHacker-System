package com;

import java.util.Scanner;

public class Factoria_T6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int n = in.nextInt();

            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println(fact);

        }
    }
