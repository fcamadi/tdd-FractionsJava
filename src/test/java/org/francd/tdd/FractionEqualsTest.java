package org.francd.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionEqualsTest {


    @Test
    void same_numerator_and_denominator() {
        assertEquals(new Fraction(3,5), new Fraction(3,5));
    }
}
