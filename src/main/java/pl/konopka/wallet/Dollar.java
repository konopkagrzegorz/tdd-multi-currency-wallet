package pl.konopka.wallet;

class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    String currency() {
        return currency;
    }

    Dollar times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
