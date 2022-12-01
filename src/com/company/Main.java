package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {

    taskArrayZeroOne();
    taskEmptyArrayMultiplyEight();
    taskMultiply();
    taskDiagonal();
    taskMinMax();
    int[] array = {2, 2, 2, 1, 2, 2, 10, 1};
    var str = taskCompare(array);
    System.out.println(str);
    int[] array2 = {10, 20, 30, 40, 50};
    var n = 2;
    taskShiftFirstMethod(array2, n);
    int[] array3 = {10, 20, 30, 40, 50};
    var n2 = 2;
    taskShiftSecondMethod(array3, n2);
  }

  private static void taskShiftSecondMethod(int[] array, int n) {

    List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
    Collections.rotate(list, n);
    System.out.println(list);
  }

  private static void taskShiftFirstMethod(int[] arr, int n) {

    for (int i = 0; i < n; i++) {
      int j, last;
      //Stores the last element of array
      last = arr[arr.length - 1];

      for (j = arr.length - 1; j > 0; j--) {
        //Shift element of array by one
        arr[j] = arr[j - 1];
      }
      //Last element of array will be added to the start of array.
      arr[0] = last;
    }
    for (int k : arr) {
      System.out.print(k + " ");
    }
  }


  private static String taskCompare(int[] array) {

    var sumArray = IntStream.of(array).sum();
    var sumCompare = 0;
    var str = "";
    for (int j : array) {
      if (sumArray == sumCompare) {
        str = str + " ||";
      }
      str = str + " " +j;
      sumArray -= j;
      sumCompare += j;
    }
    return str;
  }


  private static void taskMinMax() {
    int[] array = {1, 5, 3, 6, 7, 95, 1, 2};
    var max = 0;
    var min = array[0];
    for (int i : array) {
      if (max < i) {
        max = i;
      }
      if (min > i) {
        min = i;
      }
    }
    System.out.println("Минимальное значение = " + min + " Максимальное значение = " + max);
  }

  private static void taskDiagonal() {
    int[][] arrayThree = new int[3][3];
    for (int i = 0; i < arrayThree.length; i++) {
      for (int x = 0; x < arrayThree.length; x++) {
        if (x == i) {
          arrayThree[i][x] = 1;
        }
      }
    }
    System.out.println(Arrays.deepToString(arrayThree).replace("],", "],\n"));
  }

  private static void taskMultiply() {
    int[] arrayMulti = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < arrayMulti.length; i++) {
      if (arrayMulti[i] < 6) {
        arrayMulti[i] *= 2;
      }
      System.out.print(arrayMulti[i] + " ");
    }
  }

  private static void taskEmptyArrayMultiplyEight() {
    int[] array = new int[8];
    var a = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] += a;
      a += 3;
      System.out.print(array[i] + " ");
    }
  }

  private static void taskArrayZeroOne() {
    int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 0) {
        array[i] = 1;
      } else array[i] = 0;
      System.out.print(" " + array[i]);
    }
    System.out.println();
  }
}