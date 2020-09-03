package com.rockey.hackerearth.tripadvisor;


import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class tripadvisor_task5 {
  private static int[] parseCoord(String s) {
    int[] output = new int[2];
    int k = s.length() - 1;
    output[1] = s.charAt(k) - 'A' + 1;
    output[0] = Integer.parseInt(s.substring(0, k));
    return output;
  }

  private List<int[]> shipPositions(String str) {
    return Stream.of(str.split(","))
        .flatMap(x -> Stream.of(x.split(" ")))
        .map(tripadvisor_task5::parseCoord).collect(Collectors.toList());
  }

  public String solution(int N, String S, String T) {
    List<int[]> shipPositions = shipPositions(S);
    List<int[]> hitsList = Stream.of(T.split(" "))
        .map(tripadvisor_task5::parseCoord)
        .collect(Collectors.toList());
    int sunk = 0;
    int alive = 0;
    for (int i = 0; i < shipPositions.size(); i += 2) {
      int[] crossleft = shipPositions.get(i);
      int[] crossDown = shipPositions.get(i + 1);
      int max = Math.abs(crossDown[0] - crossleft[0]) * (Math.abs(crossleft[1] - crossDown[1]) + 1)
          + (Math.abs(crossleft[1] - crossDown[1]) + 1);
      boolean isBombed = false;
      for (int[] hit : hitsList) {
        if (crossleft[1] <= hit[1] && hit[1] <= crossDown[1]) {
          if (hit[0] <= crossDown[0] && crossleft[0] <= hit[0]) {
            max--;
            isBombed = true;
          }
        }
      }
      if (max == 0)
        sunk++;
      else if (isBombed)
        alive++;
    }
    return String.format("%d,%d", sunk, alive);
  }

  public static String solve(int N, String S, String T) {
    return new tripadvisor_task5().solution(N, S, T);
  }

  public static void main(String[] args) {
    System.out.println( solve(3, "1A 1B,2C 2C", "1B"));
    assertEquals("1,1", solve(10, "1B 2C,2D 4D", "2B 2D 3D 4D 4A"));
    assertEquals("0,1", solve(3, "1A 1B,2C 2C", "1B"));
    assertEquals("1,0", solve(3, "1A 1A", "1A"));
    assertEquals("1,0", solve(3, "1A 1A,2B 2B", "1A"));
    assertEquals("0,1", solve(6, "1A 1D", "1A"));
    assertEquals("1,0", solve(6, "1A 1D", "1A 1B 1C 1D"));
    assertEquals("0,0", solve(6, "1A 1D", "2A 2B 2C 2D"));
    assertEquals("0,1", solve(6, "1A 1D", "2A 2B 2C 1D"));
    assertEquals("0,1", solve(6, "11A 11D", "2A 2B 2C 11D"));
  }
}
