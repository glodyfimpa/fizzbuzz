package com.glodyfimpa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void testNumber() {
        assertEquals("1", FizzBuzz.valueOf(1));
        assertEquals("2", FizzBuzz.valueOf(2));
    }

    @Test
    void testFizz() {
        assertEquals("Fizz", FizzBuzz.valueOf(3));
        assertEquals("Fizz", FizzBuzz.valueOf(6));
    }

    @Test
    void testBuzz() {
        assertEquals("Buzz", FizzBuzz.valueOf(5));
        assertEquals("Buzz", FizzBuzz.valueOf(10));
    }

    @Test
    void testValueOf() {
        assertEquals("FizzBuzz", FizzBuzz.valueOf(15));
        assertEquals("FizzBuzz", FizzBuzz.valueOf(30));
    }
}
