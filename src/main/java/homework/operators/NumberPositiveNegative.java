package homework.operators;

import java.util.Scanner;

public class NumberPositiveNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        int checkNumber = scan.nextInt();

        if (checkNumber < 0)
            System.out.println("The number is negative");
        else if (checkNumber > 0)
            System.out.println("The number is positive");
        else
            System.out.println("The number is 0");

    }
}
