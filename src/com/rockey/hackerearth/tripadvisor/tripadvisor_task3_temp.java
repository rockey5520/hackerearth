package com.rockey.hackerearth.tripadvisor;

public class tripadvisor_task3_temp {

  public static void main(String[] args) {
    String s = "1111010101111";
    System.out.println(solution(s));

  }

  static int solution(String S) {
    S = invertString(S);
    int n = S.length();
    int[][] dynamicArray = new int[n + 1][2];
    if (S.charAt(0) == '0')
      dynamicArray[0][0] = 0;
    else
      dynamicArray[0][0] = 1;

    dynamicArray[0][1] = 1;
    for (int i = 1; i < n; i++)
      if (S.charAt(i) == '0') {
        dynamicArray[i][0] = dynamicArray[i - 1][0];
        dynamicArray[i][1] = 1 + Math.min(dynamicArray[i - 1][1], dynamicArray[i - 1][0]);
      } else {
        dynamicArray[i][1] = dynamicArray[i - 1][1];
        dynamicArray[i][0] = 1 + Math.min(dynamicArray[i - 1][0], dynamicArray[i - 1][1]);
      }
    return dynamicArray[n - 1][0];
  }

  static String invertString(String str) {
    char[] charArray = str.toCharArray();
    int i, j = 0;
    j = charArray.length - 1;
    for (i = 0; i < j; i++, j--) {
      char temp = charArray[i];
      charArray[i] = charArray[j];
      charArray[j] = temp;
    }
    return String.valueOf(charArray);
  }


  public static int calc(String s) {
    //int num = Integer.parseInt(s, 2);
    int num = Integer.parseUnsignedInt(s, 2);
    int count = 0;
    while (num != 0) {
      num = num % 2 == 0 ? num / 2 : num - 1;
      count++;
    }
    return count;
  }
}
