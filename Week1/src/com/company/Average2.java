package com.company;
import java.util.*;
public class Average2 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            double a,b,c,average_weight;
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
            average_weight=((a*2)+(b*3)+(c*5))/10;
            System.out.printf("MEDIA = %.1f\n",average_weight);

        }

    }
