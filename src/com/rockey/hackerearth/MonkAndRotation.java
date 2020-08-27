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


  public static void rotatev2(int[] arr, int order) {
    if (arr == null || order < 0) {
      throw new IllegalArgumentException("Illegal argument!");
    }

    for (int i = 0; i < order; i++) {
      for (int j = arr.length - 1; j > 0; j--) {
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }


  private static void rotatev1(int[] array, int rotation) {
    if (rotation > array.length) {
      rotation = rotation % array.length;
    }

    int[] result = new int[array.length];
    for (int i = 0; i < rotation; i++) {
      result[i] = array[array.length - rotation + i];
    }

    int j = 0;
    for (int i = rotation; i < array.length; i++) {
      result[i] = array[j];
      j++;
    }

    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }

}
