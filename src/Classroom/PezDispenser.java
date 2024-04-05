package Classroom;

public class PezDispenser {
    private String serie;
    private String color;
    private final int MAX_AMOUNT = 12;
    private int currentAmount;

    public PezDispenser(String serie, String color) {
        this.serie = serie;
        this.color = color;
        this.currentAmount = MAX_AMOUNT;
    }

    public PezDispenser() {
    }

    public String getSerie() {
        return serie;
    }

    public String getColor() {
        return color;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    @Override
    public String toString() {
        return "PezDispenser{" +
                "serie='" + serie + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    // decrement for 1

    public void eat() {
        if(getCurrentAmount() <=0) {
            System.out.println("No candies left. Please restock me.");
        } else {
            System.out.println("Eat a candy!");
            currentAmount --;
        }
    }

    // restore the amount of candies to 12
    public void restock() {
        currentAmount = MAX_AMOUNT;
        System.out.println("Pez has max amount of candies");
    }

    // will accept candies amount and decrement accordingly

    public void eat(int candiesAmount) {
        if(candiesAmount > MAX_AMOUNT) {
            System.out.println("Candies amount cannot be greater than max amount");
        } else {
            if(currentAmount - candiesAmount < 0) {
                System.out.println("No candies");
            } else {
                currentAmount = currentAmount - candiesAmount;
            }
        }
    }

    // Create method with name restock that accepts candies amount;
    public void restock(int candiesAmount) {
        if(candiesAmount > MAX_AMOUNT) {
            System.out.println("Candies amount is greater than max amount");
        } else {
            if (currentAmount + candiesAmount > MAX_AMOUNT) {
                System.out.println("Can't restock!");
            } else {
                currentAmount = currentAmount + candiesAmount;
            }
        }
    }
}
