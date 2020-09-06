package com.rockey.hackerearth.sorting.monkandsuffixsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

  public static BufferedReader br;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    String[] readLine = br.readLine().split("\\s");
    String input = readLine[0];
    int N = Integer.parseInt(readLine[1]);
    List<String> list = new ArrayList<>();
    for (int i = 0; i < input.length(); i++) {
      list.add(input.substring(i));
    }
    Collections.sort(list);
    System.out.println(list.get(N - 1));
  }
}
