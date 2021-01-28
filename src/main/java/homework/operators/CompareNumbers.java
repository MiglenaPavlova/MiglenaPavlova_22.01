package homework.operators;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number A ");
        int a = scan.nextInt();
        System.out.println("Enter number B ");
        int b = scan.nextInt();
        System.out.println("Enter number C ");
        int c = scan.nextInt();

            if (a > b && a > c)
                System.out.println("The biggest number is A:"+ a);
            else if (b > a && b > c)
                System.out.println("The biggest number is B:"+ b);
            else if (c > a && c > b)
                System.out.println("The biggest number is C:"+ c);
            else
                if (a == b)
                    System.out.println("A and B are equal " + a);
               // System.out.println("There are two or three equal numbers");
                else if (b == c)
                    System.out.println("B and C are equal " + b);
                else if (a == c)
                    System.out.println("A and C are equal  " + a);
                else
                    System.out.println("There three numbers are equal");

    }
}
