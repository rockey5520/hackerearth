package com.rockey.hackerearth.tripadvisor;

import java.util.Arrays;
import java.util.stream.Collectors;

public class tripadvisor_task1 {

  public static void main(String[] args) {
    int[] a = new int[]{-6,-91,1011,-100,84, -22,0, 1,473};
    int max = solution(a);
  }

  private static int solution(int[] a) {
    int ints = Arrays.stream(a).filter(x -> x < 10).filter(x -> x > -10).max().getAsInt();
    System.out.println(ints);

    return 0;
  }

}
