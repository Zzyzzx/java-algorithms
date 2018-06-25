package dhan.algorithms.sorting.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import dhan.algorithms.sorting.quicksort.QuickSort;
import dhan.algorithms.utils.SortChecker;

public class QuickSortTester {

  QuickSort quickSort = new QuickSort();

  @Test
  public void testParition() {
    Integer[] list = {6, 5, 1, 3, 8, 4, 7, 9, 2};
    System.out.println(quickSort.partition(list, list.length - 1, 0, list.length - 1));
    SortChecker.printArray(list);
    assertTrue(SortChecker.isSorted(list));
  }

  @Test
  public void testPartition2() {
    Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(quickSort.partition(list, 7, 5, 7));
    SortChecker.printArray(list);
    assertTrue(SortChecker.isSorted(list));
  }

  @Test
  public void testQuicksort() {
    Integer[] list = {6, 5, 1, 3, 8, 4, 7, 9, 2};
    quickSort.sort(list);
    SortChecker.printArray(list);
    assertTrue(SortChecker.isSorted(list));
  }
}
