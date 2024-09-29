package com.glodyfimpa;

public class FizzBuzz {

    public static String valueOf(int n) {

        if (isDivisibleBy3(n) && isDivisibley5(n)) {
            return "FizzBuzz";
        } else if (isDivisibleBy3(n)) {
            return "Fizz";
        } else if (isDivisibley5(n)) {
            return "Buzz";
        }

        return String.valueOf(n);
    }

    private static boolean isDivisibleBy3(int n) {
        return n % 3 == 0;
    }

    private static boolean isDivisibley5(int n) {
        return n % 5 == 0;
    }

}
