package com.rockey.hackerearth.monkinversion;

import java.util.Scanner;

public class MonkAndInversion {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t != 0) {
      int N = in.nextInt();
      int[][] array = new int[N][N];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          array[i][j] = in.nextInt();
        }
      }
      int inverCount = 0;
      for (int p = 0; p < N; p++) {
        for (int q = 0; q < N; q++) {
          for (int i = 0; i <= p; i++) {
            for (int j = 0; j <= q; j++) {
              if (array[p][q] < array[i][j]) {
                inverCount++;
              }
            }
          }
        }
      }
      System.out.println(inverCount);
      t--;
    }
  }
}
