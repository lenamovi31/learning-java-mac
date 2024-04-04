package Classroom;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int input = myScanner.nextInt();

        if(input <= 0) {
            System.out.println("Please enter a positive number!");
        } else {
            int summa = 0;
            for (int i = 2; i <= input; i= i + 2) {
                summa = summa + i;
            }
            System.out.println("Summa: " + summa);
        }
    }
}
