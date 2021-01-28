package homework.operators;

import java.util.Scanner;

public class CalculateRectangle {
    private static double a;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side length a:");
        double a = scan.nextDouble();
        System.out.println("Enter side length b:");
        double b = scan.nextDouble();
        double S = a*b;
        double P = 2*(a+b);
        System.out.println("Area of rectangle is " + S);
        System.out.println("Perimeter of rectangle is " + P);

    }

}

