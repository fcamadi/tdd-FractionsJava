package org.francd.tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestCommonDivisorTest {

    @Test
    void one_and_one() {
        assertEquals(1, gcd(1,1));
    }

    private int gcd(int a, int b) {
        //taken from wikipedia (iterative version)
        while (b!=0) {
            int t = b;
            b = a % t;
            a = t;
        }
        return a;
    }
}
