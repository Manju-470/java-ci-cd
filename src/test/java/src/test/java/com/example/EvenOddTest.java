
package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EvenOddTest {

    @Test
    public void testEvenNumber() {
        assertEquals("Even", EvenOdd.checkEvenOdd(4));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", EvenOdd.checkEvenOdd(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        assertEquals("Even", EvenOdd.checkEvenOdd(-6));
    }
}
