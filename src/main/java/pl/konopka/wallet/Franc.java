package pl.konopka.wallet;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    String currency() {
        return currency;
    }

    Franc times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
