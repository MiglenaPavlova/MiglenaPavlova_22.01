package homework.operators;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number between 1 and 7 ");
        int dayNumber = scan.nextInt();
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                System.out.println("The day is  " + dayName);
                break;
            case 2:
                dayName = "Tuesday";
                System.out.println("The day is  " + dayName);
                break;
            case 3:
                dayName = "Wednesday";
                System.out.println("The day is  " + dayName);
                break;
            case 4:
                dayName = "Thursday";
                System.out.println("The day is  " + dayName);
                break;
            case 5:
                dayName = "Friday";
                System.out.println("The day is  " + dayName);
                break;
            case 6:
                dayName = "Saturday";
                System.out.println("The day is  " + dayName);
                break;
            case 7:
                dayName = "Sunday";
                System.out.println("The day is  " + dayName);
                break;
            default:
                System.out.println("You entered not valid number (must be from 1 to 7)");

            }
        }
    }
