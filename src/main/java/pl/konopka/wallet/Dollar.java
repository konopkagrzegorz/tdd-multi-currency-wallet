package pl.konopka.wallet;

class Dollar {

    private int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }
}
