package gael;

public class Model {
    public static Double sum(Double number1, Double number2) {
        return number1 + number2;
    }

    public static Double subtraction(Double number1, Double number2) {
        return number1 - number2;
    }

    public static Double multiplication(Double number1, Double number2) {
        return number1 * number2;
    }

    public static Double division(Double number1, Double number2) {
        if(number2 == 0d ){
            throw new ArithmeticException("Ilegal second value")
        }
        return number1 / number2;
    }

}
