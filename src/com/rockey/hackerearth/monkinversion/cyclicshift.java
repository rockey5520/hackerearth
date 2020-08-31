package com.rockey.hackerearth.monkinversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class cyclicshift {


  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(0);
    list.add(1);
    list.add(0);
    list.add(1);

    int K = 2;
    int total = 0;
    while (K > 0){
      Map<String,Integer> mainList = new HashMap<>();
      int i = 0;
      while (i < list.size()){
        list = shiftPositions(list);
        i++;
        String string = listToString(list);

        if (!mainList.containsKey(string)){
          mainList.put(string,Integer.parseInt(string,2));
        }else{
          mainList.clear();
          list.clear();
          list = stringToList(string);
          total++;
          break;
        }
        System.out.println(string);
        System.out.println(Integer.parseInt(string,2));



//        String mapAsString = mainList.keySet().stream()
//            .map(key -> key + "=" + mainList.get(key))
//            .collect(Collectors.joining(", ", "{", "}"));
        //System.out.println(mapAsString);
      }
      K--;
    }
    System.out.println("final "+total);
  }

  private static List<Integer> shiftPositions(List<Integer> list) {
    List<Integer> newList = new ArrayList();
    for (int i = 1; i < list.size() ; i++) {
      newList.add(list.get(i));
    }
    newList.add(list.get(0));
    return newList;
  }

  private static String listToString(List<Integer> list) {
    StringBuilder stringBuilder = new StringBuilder();
    list.forEach(stringBuilder::append);
    return stringBuilder.toString();
  }

  private static List<Integer> stringToList(String str){
    final int[] ints2 = Stream.of(str.split(""))
        .mapToInt(Integer::parseInt)
        .toArray();
    Integer[] integers = Arrays.stream(ints2)
        .boxed()
        .toArray(Integer[]::new);
    return Arrays.asList(integers);
  }

}
