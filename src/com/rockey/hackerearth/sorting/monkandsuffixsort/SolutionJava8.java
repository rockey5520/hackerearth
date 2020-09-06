package com.rockey.hackerearth.sorting.monkandsuffixsort;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SolutionJava8 {

  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    String[] readLine = br.readLine().split("\\s");
    String input = readLine[0];
    int N = parseInt(readLine[1]);
    System.out.println(IntStream.range(0, input.length()).mapToObj(input::substring).sorted()
        .collect(Collectors.toList()).get(N - 1));
  }
}
