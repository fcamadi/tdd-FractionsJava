package org.francd.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddFractionsTest {

    @Test
    void zero_plus_zero()  {

        assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue());
    }

    @Test
    void nonzero_plus_zero()  {

        assertEquals(3, new Fraction(3).plus(new Fraction(0)).intValue());
    }

    @Test
    void zero_plus_nonzero()  {

        assertEquals(5, new Fraction(0).plus(new Fraction(5)).intValue());
    }

    @Test
    void nonnegative_nonzero_operands()  {

        assertEquals(7, new Fraction(3).plus(new Fraction(4)).intValue());
    }

    @Test
    void negativeinput_and_negativeoutput()  {

        assertEquals(-2, new Fraction(-3).plus(new Fraction(1)).intValue());
    }
}
