package com.rockey.hackerearth.taxdoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class prime {

  public static void main(String[] args) {
    System.out.println(isPrime(1));
  }

  private static int isPrime(long n) {
    if (n < 2) {
      return smallestDivisor(n);
    }
    if (n == 2){
      return 1;
    }
    if (n == 3) {
      return smallestDivisor(n);
    }
    if (n % 2 == 0 || n % 3 == 0) {
      return smallestDivisor(n);
    }
    long sqrtN = (long) Math.sqrt(n) + 1;
    for (long i = 6L; i <= sqrtN; i += 6) {
      if (n % (i - 1) == 0 || n % (i + 1) == 0) {
        return smallestDivisor(n);
      }
    }
    return 1;

  }

  private static int smallestDivisor(long n) {
    List<Long> numbers = new ArrayList<>();
    // Note that this loop runs till square root
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        // If divisors are equal, print only one
        if (n / i == i) {
          numbers.add(Long.valueOf(i));
        } else // Otherwise print both
        {
          numbers.add((long) i);
          numbers.add(n/i);
        }
      }
    }
    Collections.sort(numbers);
    List<Long> collect = numbers.stream().filter(x -> x > 1).collect(Collectors.toList());
    return Math.toIntExact(collect.get(0));
  }
}
