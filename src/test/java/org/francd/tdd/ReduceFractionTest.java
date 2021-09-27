package org.francd.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReduceFractionTest {

    @Test
    void already_in_lowest_terms() {
        assertEquals(new Fraction(3,4), new Fraction(3,4));
    }

    @Test
    void reduce_to_not_whole_number() {
        assertEquals(new Fraction(3,4),new Fraction(6,8));
    }
}
