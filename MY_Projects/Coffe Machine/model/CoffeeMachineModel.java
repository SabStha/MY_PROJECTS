public class CoffeeMachineModel {
    private int waterLevel; // in ml
    private int coffeeBeans; // in grams
    private int milk; // in ml

    // Constructor
    public CoffeeMachineModel() {
        waterLevel = 1000;  // 1000 ml of water
        coffeeBeans = 500;  // 500 grams of coffee beans
        milk = 500;         // 500 ml of milk
    }

    // Getters and Setters
    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    // Method to simulate making coffee
    public boolean makeCoffee(String type) {
        if (type.equals("Espresso") && waterLevel >= 50 && coffeeBeans >= 20) {
            waterLevel -= 50;
            coffeeBeans -= 20;
            return true;
        } else if (type.equals("Latte") && waterLevel >= 100 && coffeeBeans >= 20 && milk >= 50) {
            waterLevel -= 100;
            coffeeBeans -= 20;
            milk -= 50;
            return true;
        } else if (type.equals("Cappuccino") && waterLevel >= 100 && coffeeBeans >= 20 && milk >= 50) {
            waterLevel -= 100;
            coffeeBeans -= 20;
            milk -= 50;
            return true;
        }
        return false; // Not enough resources
    }

    // Method to refill the resources
    public void refillWater() {
        waterLevel = 1000;  // Refill water to 1000 ml
    }

    public void refillBeans() {
        coffeeBeans = 500;  // Refill coffee beans to 500 grams
    }

    public void refillMilk() {
        milk = 500;  // Refill milk to 500 ml
    }
}
