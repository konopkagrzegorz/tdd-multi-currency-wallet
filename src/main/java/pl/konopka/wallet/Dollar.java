package pl.konopka.wallet;

class Dollar {

    private int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    void times(int multiplier) {
        this.amount *= multiplier;
    }
}
