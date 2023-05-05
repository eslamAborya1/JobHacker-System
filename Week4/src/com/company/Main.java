package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(4,40);
        Rectangle r2=new Rectangle(3.5,35.9);
        // Rectangle 1

        System.out.println("----- Recatangle 1 -----");
        System.out.println("width = "+r1.getWidth());
        System.out.println("Height = "+r1.getHeight());
        System.out.println("Area = "+r1.getArea());
        System.out.println("perimeter = "+r1.getPerimeter());

        // Rectangle 2
        System.out.println("----- Recatangle 2 -----");
        System.out.println("width = "+r2.getWidth());
        System.out.println("Height = "+r2.getHeight());
        System.out.println("Area = "+r2.getArea());
        System.out.println("perimeter = "+r2.getPerimeter());
    }
}
