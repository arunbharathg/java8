package com.arun.dailycodingproblem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {
    public static Object fizzBuzz(int number) {
        if(number % 3 ==0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if(number % 3 == 0) {
            return "Fizz";
        }
        if(number % 5 == 0) {
            return "Buzz";
        }
        return number;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        numbers.parallelStream().map(FizzBuzz::fizzBuzz).collect(Collectors.toList()).forEach(System.out::println);
    }
}
