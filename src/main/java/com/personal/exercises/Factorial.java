package com.personal.exercises;

public class Factorial {

    //private static final int STARTING = 1;

    public float of(int n) {
        checkInput(n);

        //return IntStream.rangeClosed(STARTING, n).reduce(1, (factorial, element) -> factorial * element); // this is slower, than the while
        float factorial = 1;
        int counter = 1;
        while (counter <= n) {
            factorial *= counter;
            counter++;
        }
        return factorial;
    }

    public float inverse(int n) {
        checkInput(n);

        float factorial = 1;
        int counter = n;
        while (counter >= 1) {
            factorial *= counter;
            counter--;
        }
        return factorial;
    }

    private void checkInput(int n) {
        if (n < 0)
            throw new IllegalArgumentException("We can't calculate the Factorial of " + n);
    }
}

