package com.personal.exercises;

public class Stack {
    private int size = 0;

    private int [] elements;

    public Stack(int maxCapacity) {
        this.elements = new int[maxCapacity];
    }

    public Stack() {
        this(10);
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void push(int element) {
        if (this.size == this.elements.length)
            throw new Overflow();

        this.elements[this.size++] = element;
    }

    public int pop() {
        if (isEmpty())
            throw new Undeflow();

        return this.elements[--this.size];
    }

    public class Undeflow extends RuntimeException {
    }

    public class Overflow extends RuntimeException {
    }
}
