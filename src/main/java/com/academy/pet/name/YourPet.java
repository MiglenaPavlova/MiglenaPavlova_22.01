package com.academy.pet.name;

import java.util.Scanner;

public class YourPet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pet´s name: ");
        String pet = scanner.nextLine();
        System.out.println("What is his favorite action: ");
        String action = scanner.nextLine();
        printData(pet, action);

    }

    public static void printData(String pet, String action){

        System.out.println("Your pet´s name is: " + pet);
        System.out.println("His favorite action is: " + action);


    }
}
