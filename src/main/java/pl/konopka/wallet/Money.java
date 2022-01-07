package pl.konopka.wallet;

public abstract class Money {

    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    abstract Money times(int multiplier);

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    static Franc franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
