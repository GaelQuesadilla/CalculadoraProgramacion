import java.util.Scanner;

public class View {

    private final Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.printf("----------- CALCULADORA -----------\n", ANSI.PURPLE_BACKGROUND, ANSI.RESET);
        System.out.printf("%s1.%s Sumar\n", ANSI.GREEN, ANSI.RESET);
        System.out.printf("%s2.%s Restar\n", ANSI.GREEN, ANSI.RESET);
        System.out.printf("%s3.%s Multiplicar\n", ANSI.GREEN, ANSI.RESET);
        System.out.printf("%s4.%s Dividir\n", ANSI.GREEN, ANSI.RESET);
        System.out.printf("%s5.%s Salir\n", ANSI.GREEN, ANSI.RESET);
        System.out.print("Seleccione una opción: ");
    }

    public Integer readChoice() {
        return scanner.nextInt();
    }

    public Double[] readNumbers(String message) {
        System.out.printf(message + "\n", "primer");
        System.out.print(ANSI.CYAN);
        Double firstNumber = scanner.nextDouble();
        System.out.print(ANSI.RESET);

        System.out.printf(message + "\n", "segundo");
        System.out.print(ANSI.CYAN);
        Double secondNumber = scanner.nextDouble();
        System.out.print(ANSI.RESET);

        Double[] numbers = { firstNumber, secondNumber };
        return numbers;

    }

    public void showResult(Double result) {
        System.out.printf("Resultado: %s%s%s\n", ANSI.GREEN, result, ANSI.RESET);
        System.out.println();

    }

    public void showError(String message) {
        System.out.printf("%sERROR:%s %s\n", ANSI.RED_BACKGROUND, ANSI.RESET, message);
        System.out.println();

    }

    public void message(String message) {
        System.out.println(message);
        System.out.println();
    }
}