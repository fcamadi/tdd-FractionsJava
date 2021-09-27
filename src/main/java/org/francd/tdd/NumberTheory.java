package org.francd.tdd;

public class NumberTheory {

    public static int gcd(int a, int b) {
        //taken from wikipedia (iterative version)
        while (b!=0) {
            int t = b;
            b = a % t;
            a = t;
        }
        return Math.abs(a);
    }
}
