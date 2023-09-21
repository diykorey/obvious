package com.andrunevchyn.obvious;

import java.util.stream.IntStream;

public class LambdaExceptionTest {

    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4, 5, 6)
                .map(LambdaExceptionTest::process)
                .forEach(System.out::println);
    }

    public static int process(int value) throws RuntimeException {
        if (value == 4)
            throw new RuntimeException();
        return value + 1;
    }
}
