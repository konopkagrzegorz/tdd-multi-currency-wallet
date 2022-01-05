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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dollar dollar = (Dollar) o;

        return amount == dollar.amount;
    }
}
