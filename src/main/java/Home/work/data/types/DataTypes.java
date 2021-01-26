package Home.work.data.types;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Replace Test with name.
        String myString = "My name is Test";
        System.out.println(myString);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(myString.replace("Test",name));

        // Compare two strings.
        String toCompare = "Good evening!";
        String toCompare2 = "Good job!";
        String toCompare3 = "Good job!";
        System.out.println("Are the toCompare and toCompare2 equal?");
        System.out.println(toCompare.equals(toCompare2));
        System.out.println("Are the toCompare3 and toCompare2 equal?");
        System.out.println(toCompare3.equals(toCompare2));

        // How long is the string?
        System.out.println("How many symbols are in myStrig?");
        System.out.println(myString.length());
        System.out.println("How many words are in myStrig?");
        String[] words = myString.split(" ");
        System.out.println(words.length);

        //Combine two strings.
        String text1 = "I love reading books ";
        String text2 = "and playing games ";
        String text3 = text1.concat(text2);
        System.out.println("The concatenated string: " + text3);
        String text4 = "The movie is %s";
        String text5 = "Good";
        System.out.println(String.format(text4, text5));
        System.out.println(String.format(text4, "good"));


    }


}
