package Classroom;

public class PlayWithObjects {
    public static void main(String[] args) {

        Animal barsik = new Animal();
        barsik.setName("Barsik");
        barsik.setAge(1);
        barsik.setColor("grey");
        System.out.println(barsik.getName());

        Animal leo = new Animal();
        leo.setName("Leo");
        leo.setAge(2);
        leo.setColor("ginger");
        System.out.println(leo.getName());

        System.out.println(barsik);
        System.out.println(leo);

        barsik.walk();
        leo.walk();

        barsik.eat();
        leo.eat();

        // create 2 objects;

        Animal viwnja = new Animal();

        viwnja.setName("Viwnja");
        viwnja.setAge(5);
        viwnja.setColor("grey");
        System.out.println(viwnja.getName());

        Animal varezhka = new Animal();
        varezhka.setName("Varezhka");
        varezhka.setAge(9);
        varezhka.setColor("white");
        System.out.println(varezhka.getName());

        viwnja.eat();
        varezhka.eat();

        viwnja.walk();
        varezhka.walk();
    }
}
