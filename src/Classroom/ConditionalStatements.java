package Classroom;

public class ConditionalStatements {
    public static void main(String[] args) {

        // if statement
        if (true) {
            System.out.println("This code is executed");
        }

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        if (x > 13) {
            System.out.println("x is greater than 13");
        }

        boolean isSpring = true;
        if (isSpring) {
            System.out.println("It is spring");
        }

        // Child <= 12
        // Teen >= 13 & <= 19
        // Adult >= 20 & <= 59
        // Else: Senior

        int age = 10;

        if (age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        // if a number is positive, negative or zero

        int number = -25;
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number == 0) {
            System.out.println("This is zero");
        } else {
            System.out.println("The number is negative");
        }

        int time = 18;
        if (time >=0 && time <=11) {
            System.out.println("Good morning!");
        } else if (time >=12 && time <= 17) {
            System.out.println("Good afternoon!");
        } else if (time >=18 && time <= 23) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Invalid hour provided!");
        }
    }
}

