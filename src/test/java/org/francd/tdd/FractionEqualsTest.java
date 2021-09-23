package org.francd.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FractionEqualsTest {


    @Test
    void same_numerator_and_denominator() {
        assertEquals(new Fraction(3,5), new Fraction(3,5));
    }

    @Test
    void different_numerators() {
        assertNotEquals(new Fraction(1,5), new Fraction(2,5));
    }

    @Test
    void different_denominators() {
        assertNotEquals(new Fraction(2,3), new Fraction(2,5));
    }

    @Test
    void whole_number_equals_same_fraction() {
        assertEquals(new Fraction(5,1), new Fraction(5));
    }

    @Test
    void whole_number_not_equal_to_different_whole_number() {
        assertNotEquals(new Fraction(6), new Fraction(5));
    }


}
