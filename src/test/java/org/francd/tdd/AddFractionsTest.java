package org.francd.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddFractionsTest {

    @Test
    void zero_plus_zero()  {
        assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));
    }

    @Test
    void nonzero_plus_zero()  {

        assertEquals(new Fraction(3), new Fraction(3).plus(new Fraction(0)));
    }

    @Test
    void zero_plus_nonzero()  {

        assertEquals(new Fraction(5), new Fraction(0).plus(new Fraction(5)));
    }

    @Test
    void nonnegative_nonzero_operands()  {
        //assertEquals(7, new Fraction(3).plus(new Fraction(4)).intValue());
        assertEquals(new Fraction(7), new Fraction(3).plus(new Fraction(4)));
    }

    @Test
    void negativeinput_and_negativeoutput()  {
        //assertEquals(-2, new Fraction(-3).plus(new Fraction(1)).intValue());
        assertEquals(new Fraction(-2), new Fraction(-3).plus(new Fraction(1)));
    }

    @Test
    void non_trivial_but_common_denominator() {
        //assertEquals(3,sum.getNumerator());     First we add the new assertion.
        //assertEquals(5,sum.getDenominator());   If the test still passes: remove the old ones (here I comment them out)
        assertEquals(new Fraction(3,5), new Fraction(1,5).plus((new Fraction(2,5))));
    }

    @Test
    void different_denominators() {
        assertEquals(new Fraction(5,6), new Fraction(1,2).plus((new Fraction(1,3))));
    }
}
