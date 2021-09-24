package org.francd.tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestCommonDivisorTest {

    @Test
    void reflexive() {
        assertEquals(1, gcd(1,1));
        assertEquals(2, gcd(2,2));
        assertEquals(1, gcd(-1,-1));
    }

    @Test
    void relatively_prime() {
        assertEquals(1, gcd(2,3));
        assertEquals(1, gcd(4,7));
        assertEquals(1, gcd(-2,-3));
    }

    @Test
    void one_is_multiple_of_the_other() {
        assertEquals(3, gcd(3,9));
        assertEquals(5, gcd(5,30));
    }

    @Test
    void common_factor() {
        assertEquals(2, gcd(6,8));
        assertEquals(7, gcd(49,315));
        assertEquals(4, gcd(-24,-28));
    }

    @Test
    void negatives() {
        //not sure if this behaviour is fine ..
        //(GCD should not be always positive?)
        assertEquals(4, gcd(-24,28));
        assertEquals(4, gcd(24,-28));
    }


    private int gcd(int a, int b) {
        //taken from wikipedia (iterative version)
        while (b!=0) {
            int t = b;
            b = a % t;
            a = t;
        }
        return Math.abs(a);
    }
}
