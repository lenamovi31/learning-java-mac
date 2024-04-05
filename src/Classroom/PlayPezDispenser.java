package Classroom;

public class PlayPezDispenser {
    public static void main(String[] args) {
        PezDispenser pez = new PezDispenser("Marvel", "red");
        System.out.println(pez.getSerie());
        System.out.println(pez.getColor());

        pez.eat();
        System.out.println(pez.getCurrentAmount());

        pez.eat(10);
        pez.eat(12);

        pez.restock(1);
        System.out.println(pez.getCurrentAmount());
        pez.restock(12);
        System.out.println(pez.getCurrentAmount());
    }
}

