package org.francd.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaFractionTest {


    @Test
    void add_fraction_no_denominator() {
        assertEquals(3, new JavaFraction(1).add(2));
    }
}
