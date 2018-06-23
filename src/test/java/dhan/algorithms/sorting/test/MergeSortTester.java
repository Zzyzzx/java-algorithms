package dhan.algorithms.sorting.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import dhan.algorithms.sorting.MergeSortInteger;
import dhan.algorithms.utils.SortChecker;

public class MergeSortTester {

  SortChecker checker = new SortChecker();
  MergeSortInteger sort = new MergeSortInteger();

  @Test
  public void testMergeArray() {
    Integer[] test = {4, 5, 6, 1, 2, 3};
    Integer[] tmp = new Integer[6];

    sort.merge(test, tmp, 0, 2, 5);

    assertTrue(SortChecker.isSorted(test));
  }

  @Test
  public void mergeSortTest1() {
    Integer[] test = {4, 5, 6, 1, 2, 3};
    sort.sort(test);

    System.out.println("\nFinal: ");
    SortChecker.printArray(test);
  }
}
