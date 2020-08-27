package com.rockey.hackerearth;

import static java.lang.System.in;

import java.util.Scanner;

public class MonkAndRotation {

  public static void main(String[] args) {
    Scanner s = new Scanner(in);
    int numberOFTestCases = s.nextInt();
    StringBuilder stringBuilder = new StringBuilder();
    while (numberOFTestCases > 0) {
      int arraySize = Integer.parseInt(s.next());
      int rotation = Integer.parseInt(s.next()) % arraySize;
      int[] array = new int[arraySize];
      for (int i = 0; i < arraySize; i++) {
        array[i] = Integer.parseInt(s.next());
      }
      for (int i = 0; i < arraySize; i++) {
        stringBuilder.append(array[((arraySize - rotation) + i) % arraySize]);
        stringBuilder.append(" ");

      }
      stringBuilder.append("\n");
      numberOFTestCases--;
    }
    System.out.println(stringBuilder);
  }

}
