package Classroom;

import java.util.Arrays;

public class ArraysAndLoops {

    public static void main(String[] args) {

        // Arrays
        // Bread, Milk, Eggs, Fruits

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits" };
        int[] grades = {7, 9, 5, 4, 8};
        String[] seasons = {"Winter", "Summer", "Autumn", "Spring" };

        String eggs = shoppingList[2];
        System.out.println(eggs);

        System.out.println(grades[2]);
        grades[0] = 2;
        System.out.println(grades[0]);

        // print all the grades
        System.out.println(Arrays.toString(grades));

        // create empty array

        int[] emptyArray = new int[4];
        System.out.println(Arrays.toString(emptyArray));

        emptyArray[0] = 1;
        emptyArray[1] = 3;
        emptyArray[2] = 5;
        emptyArray[3] = 7;
        System.out.println(Arrays.toString(emptyArray));

        // Array with names

        String[] names = {"John", "Noel", "Jack", "Jake" };
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        // Create emty double array with the size of 5
        // update array value from 0 to a number of your choice

        double[] emptyArrayDouble = new double[5];
        System.out.println(Arrays.toString(emptyArrayDouble));
        emptyArrayDouble[0] = 1.1;
        emptyArrayDouble[1] = 1.2;
        emptyArrayDouble[2] = 1.3;
        emptyArrayDouble[3] = 1.4;
        emptyArrayDouble[4] = 1.5;
        System.out.println(Arrays.toString(emptyArrayDouble));

        // Print numbers from 1 to 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Calculate the sum from 1 to 100

        int summa = 0;
        for (int i = 1; i <= 100; i++) {
            summa = summa + i;
        }
        System.out.println("Sum: " + summa);

        // for ->
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }

        // for i ->
        for (String s : shoppingList) {
            System.out.println(s);
        }

        // Print numbers from 10 to 1
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int counter = 10;
        while (counter >= 0) {
            System.out.println(counter);
            counter = counter - 1;
        }

        // Print even numbers from 1 to 100

        for (int i = 2; i <= 100; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
