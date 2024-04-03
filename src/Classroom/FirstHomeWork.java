package Classroom;

public class FirstHomeWork {

    public static void main(String[] args) {
        // 1. Easy peasy

        int x = 33;
        if (x > 0) {
            System.out.println("This is a positive number");
        }

        // 2. Odd or even

        int number = 14;
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // 3. Age group classifier

        int age = 21;
        if (age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }

        // 4. Leap year checker

        int year = 2021;
        if (year % 4 == 0) {
            System.out.println("This is a leap year!");
        } else {
            System.out.println("This is not a leap year!");
        }

        // 5. Multiple conditions

        int z = 110;
        if (z % 2 == 0 && z > 0 && z < 100) {
            System.out.println("This is a valid number!");
        } else {
            System.out.println("Wrong number!");
        }

        // 6. Nested conditions

        int a = 48;
        if (a % 2 == 0) {
            System.out.println("This is even number");
            if (a > 0) {
                System.out.println("Positive and Even.");
            }
        }

        // 7. Character type identifier

        char ch = 'u';
        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'y' || ch == 'i' || ch == 'u') {
            System.out.println("It is a vowel.");
        } else {
            System.out.println("It is a consonant.");
        }

        // 8. BMI calculator

        double weight = 50;
        double height = 1.70;
        double bmi = weight / (height * height);
        System.out.println(bmi);
        if (bmi <= 16) {
            System.out.println("Severe Thinness");
        } else if (bmi > 16 && bmi <= 18.5) {
            System.out.println("Mild Thinness");
        } else if (bmi > 18.5 && bmi <= 25) {
            System.out.println("Normal");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.println("Overweight");
        } else if (bmi > 30) {
            System.out.println("Obesity");
        }

        // 9. The final grade for a student

        int math = 88;
        int science = 93;
        int english = 99;

        double result = (math + science + english) / 3.0;
        System.out.println(result);

        if (result >= 90) {
            System.out.println("Grade A");
        } else if (result >= 80) {
            System.out.println("Grade B");
        } else if (result >= 70) {
            System.out.println("Grade C");
        } else if (result >= 60) {
            System.out.println("Grade D");
        } else if (result < 60) {
            System.out.println("Grade F");
        }

        // File checker
        String homework= "homework.pdf";
        if (homework.endsWith(".txt") || homework.endsWith(".doc") ||homework.endsWith(".pdf")) {
            System.out.println("Valid file extension");
        } else {
            System.out.println("Invalid file extension");
        }
    }
}
