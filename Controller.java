public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        int choice;
        do {
            view.mostrarMenu();
            choice = view.readChoice();

            if (choice >= 1 && choice <= 4) {
                Double[] numbers = view.readNumbers("Introduce el %s numero");

                Double firstNumber = numbers[0];
                Double secondNumber = numbers[1];
                try {
                    Double result;
                    switch (choice) {
                        case 1:
                            result = model.sum(firstNumber, secondNumber);
                            view.showResult(result);
                            break;
                        case 2:
                            result = model.subtraction(firstNumber, secondNumber);
                            view.showResult(result);
                            break;
                        case 3:
                            result = model.multiplication(firstNumber, secondNumber);
                            view.showResult(result);
                            break;
                        case 4:
                            result = model.division(firstNumber, secondNumber);
                            view.showResult(result);
                            break;
                    }
                } catch (ArithmeticException e) {
                    view.showError(e.getMessage());
                }
            } else if (choice != 5) {
                view.showError("Opción no válida.");
            }
        } while (choice != 5);

        view.message("¡Gracias por usar la calculadora!");
    }
}