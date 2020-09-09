package com.rockey.hackerearth.sorting.monkbeingmonitor;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SolutionJava8 {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCases = scanner.nextInt();
      int j = 0;
      while (j < testCases) {
        int n = scanner.nextInt();
        int[] freqArray = new int[1000000];
        IntStream.range(0, n).map(i -> scanner.nextInt()).forEach(height -> freqArray[height] += 1);
        int min = 100000;
        int max = 0;
        int minindex = 0;
        for (int i = 0; i < 1000000; i++) {
          if (freqArray[i] != 0 && freqArray[i] < min) {
            min = freqArray[i];
            minindex = i;
          }
          if (freqArray[i] != 0 && freqArray[i] > max && i > minindex) {
            max = freqArray[i];
          }
        }
        System.out.println(max - min > 0 ? max - min : -1);
        j++;
      }
    }
  }
}
