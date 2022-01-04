package pl.konopka.wallet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        Assertions.assertEquals(10,five.getAmount());
    }

}
