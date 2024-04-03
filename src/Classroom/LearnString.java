package Classroom;

public class LearnString {
    public static void main(String[] args) {
        String name = "Jelena";
        String lastname = "Dudevica";

        System.out.println(name);
        System.out.println(lastname);

        // Print name and surname
        String fullname = name + " " + lastname;
        System.out.println(fullname);

        System.out.println(name + " " + lastname);

        System.out.println(String.format("%s %s", name, lastname));

        // Hello, world!

        String hello = "Hello, ";
        String world = "world!";

        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        String myName = "My name is Jelena. ";
        String favLanguage = "I love coding in Java!";

        String nameLanguage = myName.concat(favLanguage);
        System.out.println(nameLanguage);

        String randomString = "some text";
        System.out.println(randomString.toUpperCase());

    }
}
