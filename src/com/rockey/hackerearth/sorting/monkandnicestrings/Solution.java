package com.rockey.hackerearth.sorting.monkandnicestrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] input = new String[N];
    int i = 0;
    while (i < N) {
      String value = br.readLine();
      int position = i;
      for (int j = i - 1; j >= 0; j--) {
        if (input[j].compareTo(value) > -1) {
          input[j + 1] = input[j];
          position = j;
        } else {
          break;
        }
      }
      input[position] = value;
      System.out.println(position);
      i++;
    }
  }
}
