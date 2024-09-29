package com.glodyfimpa;

import java.util.stream.IntStream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach(n -> System.out.println(FizzBuzz.valueOf(n)));
    }
}
