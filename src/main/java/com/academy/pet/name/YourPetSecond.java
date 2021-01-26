package com.academy.pet.name;

import java.util.Scanner;

public class YourPetSecond {

            public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your pet´s name: ");
            String pet = scanner.nextLine();
            System.out.println("What is his favorite action: ");
            String action = scanner.nextLine();
            System.out.println("Your pet´s name is: " + pet);
            System.out.println("His favorite action is: " + action);

               /*
         String myString2 = "My first String";
        System.out.println(String.format(myString, myString2));

        System.out.println(myString.charAt(1));
        System.out.println(myString.contains("test"));
        System.out.println(myString.length());
        String[] words = myString.split(" ");
        System.out.println(words.length);
        System.out.println(myString.toLowerCase());*/


                // System.out.println(String.format(myString, "test", 1));
        }
}
