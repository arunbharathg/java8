package com.arun.dailycodingproblem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */

public class NumberSum {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 3, 7, 1);
        NumberSum ns = new NumberSum();
        System.out.println(ns.findSumExistsWorstSolution(numbers, 17));
        System.out.println(ns.findSumExistCollectionSolution(numbers, 17));
    }

    public boolean findSumExistCollectionSolution(List<Integer> numbers, Integer k) {
        numbers = numbers.stream().distinct().collect(Collectors.toList());
        for(Integer n: numbers) {
            if(numbers.contains(k - n)) {
                return  true;
            }
        }
        return false;
    }

    public boolean findSumExistsWorstSolution(List<Integer> numbers, Integer k) {
        int sum = 0;
        int n1Counter = 0;
        int n2Counter = 1;
        for(int i=0; i< numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if(i == j) {
                    continue;
                }
                sum =  numbers.get(i) + numbers.get(j);
                if (sum == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
