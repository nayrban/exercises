package com.personal.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    private Stack stack;

    @Before
    public void setup() {
        this.stack = new Stack();
    }

    @Test
    public void isEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void push_ThenNotEmpty() {
        stack.push(12);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void push_Pop_ThenIsEmpty() {
        stack.push(23);
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test(expected = Stack.Underflow.class)
    public void pop_ThenExpectAndException() {
        stack.pop();
    }

    @Test
    public void push_ThenValidatePop() {
        stack.push(12);
        stack.push(11);
        stack.push(1);
        assertEquals(1, stack.pop());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createStack_WithInvalidCapacity() {
        this.stack = new Stack(-1);
    }

    @Test(expected = Stack.Overflow.class)
    public void createStackWithCapacity_ThenExpectAdException() {
        this.stack = new Stack(0);
        stack.push(0);
    }
}
