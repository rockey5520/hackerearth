package com.rockey.hackerearth.minimumandxoror;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int testCases = parseInt(br.readLine());
      int i = 0;
      while (i < testCases) {
        int N = parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int[] a = new int[N];
        for (int j = 0; j < N; j++) {
          a[j] = parseInt(tokenizer.nextToken());
        }
        int xor, min = 1_000_000_000;
        sort(a);
        for (int j = 0; j < N - 1; j++) {
          xor = a[j] ^ a[j + 1];
          if (xor < min) {
            min = xor;
          }
        }
        System.out.println(min);
        i++;
      }
    }
  }
}
