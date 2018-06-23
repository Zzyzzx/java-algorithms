package dhan.algorithms.utils;

public class SortChecker {

  public static boolean isSorted(Integer[] list) {
    if (list.length == 0)
      return true;

    for (int i = 1; i < list.length; i++)
      if (list[i - 1] > list[i])
        return false;

    return true;
  }

  public static void printArray(Integer[] list) {
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
}
