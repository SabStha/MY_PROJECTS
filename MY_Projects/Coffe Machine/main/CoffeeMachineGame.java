public class CoffeeMachineGame {
    public static void main(String[] args) {
        CoffeeMachineModel model = new CoffeeMachineModel();
        CoffeeMachineView view = new CoffeeMachineView();
        CoffeeMachineController controller = new CoffeeMachineController(model, view);

        controller.start();  // Start the game
    }
}
