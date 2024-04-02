public class DataTypes {
    public static void main(String[] args) {
        // Variable: int
        int numberOfStudent = 30;
        int maxScore = 10;

        System.out.println(numberOfStudent);
        System.out.println(maxScore);

        // Variable: double
        double temperature = 21.9;
        double price = 20.99;

        // Variable: float
        float pi = 3.14f;
        float radius = 6.7f;
        float area = pi * radius * radius;
        System.out.println(area);

        // casting
        int areaInteger = (int) area;
        System.out.println(Math.round(area));

        // char
        char symbol = '$';

        // my name
        char l = 76;
        System.out.println(l);
        char e = 69;
        System.out.println(e);
        char n = 78;
        System.out.println(n);
        char a = 65;
        System.out.println(a);

        // boolean - is or has

        boolean isRaining = true;
        boolean isWinter = false;
        System.out.println(isWinter);
        System.out.println(isRaining);
    }
}
