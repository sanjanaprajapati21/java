class PowerCalculator {

    public double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();
        double base = 5;
        int exponent = 3;
        double power = calculator.power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + power);
    }
}
