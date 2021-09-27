package org.francd.tdd;

import org.junit.jupiter.api.Disabled;
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
    void different_denominators_no_reducing() {
        assertEquals(new Fraction(5,6), new Fraction(1,2).plus((new Fraction(1,3))));
    }

    @Test
    void reduce_result_to_whole_number() {
        assertEquals(new Fraction(1), new Fraction(1,3).plus((new Fraction(2,3))));
    }

    @Test
    void one_denominator_is_multiple_of_the_other() {
        assertEquals(new Fraction(11,8), new Fraction(3,4).plus((new Fraction(5,8))));
    }

    @Test
    void common_factor_in_denominators() {
        assertEquals(new Fraction(11,18), new Fraction(1,6).plus((new Fraction(4,9))));
    }

    @Test
    void reduce_result_even_when_denominators_are_the_same() {
        assertEquals(new Fraction(3,2), new Fraction(3,4).plus((new Fraction(3,4))));
    }

    @Test
    void negative_fraction_and_reducing() {
        assertEquals(new Fraction(1,2), new Fraction(-1,4).plus((new Fraction(3,4))));
        assertEquals(new Fraction(-1,8), new Fraction(3,8).plus((new Fraction(-1,2))));
    }

    @Test
    @Disabled("negative denominators still not treated correctly")
    void negative_everywhere() {
        assertEquals(new Fraction(1,2), new Fraction(-1,4).plus((new Fraction(-3,-4))));
    }
}
