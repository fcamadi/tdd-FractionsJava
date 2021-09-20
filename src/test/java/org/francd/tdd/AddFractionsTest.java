package org.francd.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddFractionsTest {

    @Test
    void zero_plus_zero()  {

        Fraction num = new Fraction(0).plus(new Fraction(0));
        assertEquals(0,num.intValue());
    }

    @Test
    void nonzero_plus_zero()  {

        Fraction num = new Fraction(3).plus(new Fraction(0));
        assertEquals(3,num.intValue());
    }
}
