package com.rockey.hackerearth.arraysandstrings.monkinversion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dynatrace {

  public static void main(String[] args) {
    //solution(24);
    final Set<String> set = new HashSet<>(Arrays.asList("first", "second"));
    final Set<String> set1 = new HashSet<>(Arrays.asList("first1", "second1"));
    //set = set1;
    set.forEach(System.out::println);

  }


  private static void solution(int N) {

    for (int num = 1; num <= N; num++) {
      if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
        System.out.println("CodilityTestCoders");
      } else if (num % 2 == 0 && num % 3 == 0) {
        System.out.println("CodilityTest");
      } else if (num % 3 == 0 && num % 5 == 0) {
        System.out.println("TestCoders");
      } else if (num % 2 == 0 && num % 5 == 0) {
        System.out.println("CodilityCoders");
      } else if (num % 2 == 0) {
        System.out.println("Codility");
      } else if (num % 3 == 0) {
        System.out.println("Test");
      } else if (num % 5 == 0) {
        System.out.println("Coders");
      } else {
        System.out.println(num);
      }
    }
  }

  public static class Main2 {

    public static void main(String[] args) {
      int[] a = new int[]{3, 2, -2, 5, -3};
      System.out.println(solve(a));
    }

    private static int solve(int[] A) {
      Arrays.sort(A);
      int i = 0;
      int j = A.length - 1;
      while (i < j) {
        if (A[i] + A[j] == 0) {
          return A[j];
        } else if (Math.abs(A[i]) > Math.abs(A[j])) {
          i += 1;
        } else if (Math.abs(A[i]) < Math.abs(A[j])) {
          j -= 1;
        }
      }
      return 0;
    }

  }
}
