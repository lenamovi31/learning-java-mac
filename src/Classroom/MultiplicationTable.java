package Classroom;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int answer = myScanner.nextInt();

        System.out.println("This is a multiplication table for number: " + answer);
        for (int i = 1; i <= 10; i++) {
            int result = answer * i;
            System.out.println(String.format("%d * %d = %d", answer, i, result));
        }
    }
}
