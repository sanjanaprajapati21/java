public class CalculatorTester {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 2);
        double result = calculator.add();
        calculator.displayResult();
    }
}
