package com.personal.exercises;

public class Stack {
    private int size = 0;
    private int [] elements = new int[10];

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void push(int element) {
        this.elements[this.size++] = element;
    }

    public int pop() {
        if (isEmpty())
            throw new EmptyStack();
        return this.elements[--this.size];
    }

    public class EmptyStack extends RuntimeException {
    }
}
