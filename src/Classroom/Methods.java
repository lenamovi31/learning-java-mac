package Classroom;

public class Methods {
    public static void main(String[] args) {

        System.out.println(calculateSum(44, 20));

        // Print Hello World 10 times
        printTextMultipleTimes("Hello, World!", 10);

        // Call method printValuesFromStringArray
        // You pass: array with fruits

        String[] fruits = {"Apple", "Banana", "Kiwi", "Orange"};
        printAllValuesFromStringArray(fruits);

        System.out.println(isEven(13));

        int[] numbers = {2, 4, 8, 6};
        int arraySum = printSumOfNumbers(numbers);
        System.out.println(arraySum);
    }

    public static int calculateSum(int x, int y) {
        return x + y;
    }

    public static void printTextMultipleTimes(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }

    // create a method that receives String array and print all the values

    public static void printAllValuesFromStringArray(String [] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    // create a method that will return true if number is even and false if number is odd

    public static boolean isEven(int number) {
        boolean result = number % 2 == 0;
        return result;
    }

    // method that accepts int array and returns sum of numbers;

    public static int printSumOfNumbers(int[] numbers) {
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa = summa + numbers[i];
        }
        return summa;
    }

}
