package com.rockey.hackerearth.monkinversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

public class cyclicshift {

  static final int INT_BITS = 32;


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int NumberOfTestCases = Integer.parseInt(scanner.nextLine());
    String[] line = scanner.nextLine().split(" ");
    int length = Integer.parseInt(line[0]);
    int numberOfTimes = Integer.parseInt(line[1]);
    String[] input = scanner.nextLine().split("");
    List<Integer> list = new ArrayList<>();
    for (String s : input
    ) {
      list.add(Integer.valueOf(s));
    }
    Map<Integer, Integer> map = new HashMap<>();
    StringBuilder stringBuilder = new StringBuilder();
    List<Integer> decimals = new ArrayList<>();
    for (int i = 1; i < list.size(); i++) {
      swap(list);
      list.forEach(stringBuilder::append);
      System.out
          .println(stringBuilder.toString() + " " + Integer.parseInt(stringBuilder.toString(), 2));
      //map.put(i, Integer.parseInt(stringBuilder.toString(), 2));
      decimals.add(Integer.parseInt(stringBuilder.toString(), 2));
      stringBuilder.delete(0, stringBuilder.toString().length());
    }
    int key = Collections.max(decimals);
    List<Integer> positions = new ArrayList<>();
    for (int i = 0; i < decimals.size(); i++) {
      if (decimals.get(i) == key) {
        positions.add(i + 1);
      }
    }
    List<Integer> updatedPositions = new ArrayList<>();
    int carraige = 0;
    for (int i = 0; i < positions.size(); i++) {
      updatedPositions.add(positions.get(i) - carraige);
      carraige = positions.get(i);
    }

    positions.forEach(System.out::print);
    System.out.println();
    updatedPositions.forEach(System.out::print);
    System.out.println();
    int distance = 0;
    if(updatedPositions.size() > 1){
      while (numberOfTimes != 0) {
        int temp = updatedPositions.get(0);
        System.out.println("temp "+temp);
        System.out.println("Distance "+distance);
        distance =  distance+temp;
        updatedPositions.remove(0);
        updatedPositions.add(temp);
        numberOfTimes--;
      }
    }else{
      while (numberOfTimes != 0) {
        distance = updatedPositions.get(0)+decimals.size()-decimals.get(key)+updatedPositions.get(0);
        numberOfTimes--;
      }

    }
    System.out.println(distance);

//    map.forEach((key, value) -> System.out.println(key + ":" + value));
//    Integer key = Collections.max(map.entrySet(), Comparator.comparingInt(Entry::getValue)).getKey();
//    System.out.println(key);
//    System.out.println(Collections.frequency((Collection<?>) map,key));
//    System.out.println(key+ list.size() - key + key);
    //leftRotate(Integer.parseInt(input, 2),1);

  }

  private static void swap(List<Integer> list) {
    int temp = list.get(0);
    list.remove(0);
    list.add(temp);
  }

  public static int leftRotate(int input, int d) {
    return (input << d) | (input >> (INT_BITS - d));
  }
}

