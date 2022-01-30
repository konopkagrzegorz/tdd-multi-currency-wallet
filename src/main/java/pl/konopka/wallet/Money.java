package pl.konopka.wallet;

public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency() {
        return this.currency;
    }

    Money times(int multiplier) {
        return new Money(this.amount * multiplier,this.currency);
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (amount != money.amount) return false;
        return currency.equals(money.currency);
    }

    @Override
    public int hashCode() {
        int result = amount;
        result = 31 * result + currency.hashCode();
        return result;
    }

    public Money plus(Money add) {
        return new Money(this.amount + add.amount, this.currency);
    }
}
