package com.personal.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class FactorialTest {

    private Factorial factorial;

    @Before
    public void setup() {
        this.factorial = new Factorial();
    }

    @Test
    public void calculate() {
        factorial.of(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculate_ExpectException() {
        factorial.of(-1);
    }

    @Test
    public void calculate_validateResult() {
        assertEquals(362880, factorial.of(9), 362880);
    }

    @Test
    public void calculateInverse() {
        factorial.inverse(100000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateInverse_ExpectException() {
        factorial.inverse(-1);
    }

    @Test
    public void calculateInverse_validateResult() {
        assertEquals(24, factorial.inverse(4), 24);
    }

}
