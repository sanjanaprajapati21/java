class FactorialCalculator {

    public int factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        int number = 5;
        int factorial = calculator.factorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
