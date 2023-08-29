class Coin {

    private String sideUp;

    public Coin() {
        this.sideUp = "heads";
    }

    public void flip() {
        int randomNumber = (int) Math.random() * 2;
        if (randomNumber == 0) {
            this.sideUp = "heads";
        } else {
            this.sideUp = "tails";
        }
    }

    public String getSideUp() {
        return this.sideUp;
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        int numberOfFlips = 10;
        for (int i = 0; i < numberOfFlips; i++) {
            coin.flip();
            System.out.println("The coin landed on " + coin.getSideUp());
        }
    }
}