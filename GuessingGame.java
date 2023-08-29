class GuessingGame {

    private int secretNumber;

    public GuessingGame() {
        this.secretNumber = (int) Math.random() * 100;
    }

    public int getSecretNumber() {
        return this.secretNumber;
    }

    public boolean guess(int guess) {
        return guess == this.secretNumber;
    }

    public void play() {
        System.out.println("Welcome to the guessing game!");
        System.out.println("I have generated a random number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        int guess;
        do {
            guess = Integer.parseInt(System.console().readLine());
        } while (!guess(guess));

        if (guess(guess)) {
            System.out.println("Congratulations! You guessed the number correctly!");
        } else {
            System.out
                    .println("Sorry, you guessed the number incorrectly. The correct number was " + this.secretNumber);
        }
    }
}
