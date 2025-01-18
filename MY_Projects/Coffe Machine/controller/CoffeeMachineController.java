public class CoffeeMachineController {
    private CoffeeMachineModel model;
    private CoffeeMachineView view;

    public CoffeeMachineController(CoffeeMachineModel model, CoffeeMachineView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        int userChoice = -1;
        while (userChoice != 0) {
            view.displayResources(model.getWaterLevel(), model.getCoffeeBeans(), model.getMilk());
            view.displayMainMenu();
            userChoice = view.getUserChoice();

            switch (userChoice) {
                case 1:
                    makeCoffee("Espresso");
                    break;
                case 2:
                    makeCoffee("Latte");
                    break;
                case 3:
                    makeCoffee("Cappuccino");
                    break;
                case 4:
                    model.refillWater();
                    view.displayMessage("Water refilled!");
                    break;
                case 5:
                    model.refillBeans();
                    view.displayMessage("Coffee Beans refilled!");
                    break;
                case 6:
                    model.refillMilk();
                    view.displayMessage("Milk refilled!");
                    break;
                case 0:
                    view.displayMessage("Goodbye!");
                    break;
                default:
                    view.displayMessage("Invalid choice, try again.");
            }
        }
    }

    private void makeCoffee(String type) {
        boolean success = model.makeCoffee(type);
        if (success) {
            view.displayMessage(type + " made successfully!");
        } else {
            view.displayMessage("Not enough resources to make " + type + "!");
        }
    }
}
