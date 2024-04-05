package Classroom;

public class ElectroCar {

    private String modelName;
    private String color;
    private final int MAX_ENERGY = 4;
    private int currentEnergy;

    // MAX_ENERGY should be 4;


    public ElectroCar(String modelName, String color) {
        this.modelName = modelName;
        this.color = color;
        this.currentEnergy = MAX_ENERGY;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    @Override
    public String toString() {
        return "ElectroCar{" +
                "modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public ElectroCar() {
    }

    // Task 1: create method with a name: drive, that will decrement energy for 1

    public void drive() {
        if(getCurrentEnergy() <= 0) {
            System.out.println("Not enough energy, please charge me.");
        } else {
            System.out.println("Drive");
            currentEnergy--;
        }
    }

    // Task 2: create a method with the name charge, that will fully restore energy count to 4;

    public void charge() {
        currentEnergy = MAX_ENERGY;
        System.out.println("Energy is at full capacity now!");
    }

    // Method overloading
    // Task 3: create a method drive that will accept energy count and decrement accordingly

    public void drive(int energyCount) {
        if (energyCount > MAX_ENERGY) {
            System.out.println("Energy count cannot be greater than max energy!");
        } else {
            if (currentEnergy - energyCount < 0) {
                System.out.println("Can't drive");
            } else {
                currentEnergy = currentEnergy - energyCount;
            }
        }
    }
    // Task 4: create a method with name charge that accepts energy count;
    public void charge(int energyCount) {
        if(energyCount > MAX_ENERGY) {
            System.out.println("Energy count is more than max energy");
        } else {
            if (currentEnergy + energyCount > MAX_ENERGY) {
                System.out.println("Can't charge!");
            } else {
                currentEnergy = currentEnergy + energyCount;
            }
        }
    }
}