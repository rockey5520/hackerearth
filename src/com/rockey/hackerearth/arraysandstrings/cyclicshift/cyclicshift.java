package com.rockey.hackerearth.arraysandstrings.cyclicshift;

import java.util.Scanner;

public class cyclicshift {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int NumberOfTestCases = Integer.parseInt(scanner.nextLine());
    StringBuilder stringBuilder = new StringBuilder();
    while (NumberOfTestCases-- > 0) {
      String[] line = scanner.nextLine().split(" ");
      int length = Integer.parseInt(line[0]);
      int numberOfTimes = Integer.parseInt(line[1]);
      String A = scanner.nextLine();
      stringBuilder.append(moveToMax(A, length, numberOfTimes));
      stringBuilder.append("\n");
    }
    System.out.println(stringBuilder.toString());
  }

  private static long moveToMax(String A, int N, int K) {
    String B = A;
    int AToB = 0;
    int BToA = N;
    boolean foundAgain = false;
    String cyclicString = A + A;
    for (int i = 1; i < A.length(); i++) {
      String subString = cyclicString.substring(i, i + N);
      if (subString.equals(A) && !foundAgain) {
        BToA = i - AToB;
        foundAgain = true;
      } else if (subString.compareTo(B) > 0) {
        B = subString;
        AToB = i;
        BToA = N - i;
      }
    }
    return ((long) K - 1) * ((long) (AToB + BToA)) + AToB;
  }
}

