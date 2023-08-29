class SquareRootCalculator {

    public double squareRoot(double number) {
        double guess = number / 2;
        double previousGuess = 0;
        while (guess != previousGuess) {
            previousGuess = guess;
            guess = (guess + number / guess) / 2;
        }
        return guess;
    }

    public static void main(String[] args) {
        SquareRootCalculator calculator = new SquareRootCalculator();
        double number = 16;
        double squareRoot = calculator.squareRoot(number);
        System.out.println("The square root of " + number + " is " + squareRoot);
    }
}
