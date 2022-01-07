package pl.konopka.wallet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        Assertions.assertEquals(Money.dollar(10),five.times(2));
        Assertions.assertEquals(Money.dollar(15),five.times(3));
    }

    @Test
    public void testFrancMultiplication() {
        Franc franc = Money.franc(5);
        Assertions.assertEquals(Money.franc(10),franc.times(2));
        Assertions.assertEquals(Money.franc(15),franc.times(3));
    }

    @Test
    public void testEquality() {
        Assertions.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        Assertions.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        Assertions.assertFalse(Money.dollar(5) == null);
        Assertions.assertTrue(Money.franc(10).equals(Money.franc(10)));
        Assertions.assertFalse(Money.franc(10).equals(Money.franc(5)));
        Assertions.assertFalse(Money.franc(5) == null);
        Assertions.assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }
}
