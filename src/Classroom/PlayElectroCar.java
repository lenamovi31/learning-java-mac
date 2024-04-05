package Classroom;

public class PlayElectroCar {
    public static void main(String[] args) {
        ElectroCar tesla = new ElectroCar("Model S", "black");
        System.out.println(tesla.getModelName());
        System.out.println(tesla.getColor());

        tesla.drive();
        System.out.println(tesla.getCurrentEnergy());
        tesla.drive();
        tesla.drive();
        tesla.drive();
        tesla.drive();

        tesla.charge();
        System.out.println(tesla.getCurrentEnergy());

        tesla.drive(4);
        System.out.println(tesla.getCurrentEnergy());

        tesla.charge(4);
        System.out.println(tesla.getCurrentEnergy());

        tesla.drive(2);
        System.out.println(tesla.getCurrentEnergy());
    }
}
