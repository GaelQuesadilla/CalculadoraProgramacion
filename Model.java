public class Model {

    public Double sum(Double firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }

    public Double subtraction(Double firstNumber, Double secondNumber) {
        return firstNumber - secondNumber;
    }

    public Double multiplication(Double firstNumber, Double secondNumber) {
        return firstNumber * secondNumber;
    }

    public Double division(Double firstNumber, Double secondNumber) throws ArithmeticException {
        if (secondNumber == 0) {
            throw new ArithmeticException("division by zero");
        }
        return firstNumber / secondNumber;

    }
}