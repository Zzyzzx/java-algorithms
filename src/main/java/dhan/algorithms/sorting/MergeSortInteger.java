package dhan.algorithms.sorting;

import dhan.algorithms.utils.SortChecker;

public class MergeSortInteger {

  public void sort(Integer[] list) {
    Integer[] tmp = new Integer[list.length];
    mergeSort(list, tmp, 0, list.length - 1);
  }

  public void mergeSort(Integer[] list, Integer[] tmp, int left, int right) {
    if (left < right) {
      int center = (left + right) / 2;
      mergeSort(list, tmp, left, center);
      mergeSort(list, tmp, center + 1, right);
      merge(list, tmp, left, center, right);
    }
  }

  public void merge(Integer[] list, Integer[] tmp, int left, int center, int right) {
    int i = left;
    int j = center + 1;
    int count = 0;

    while (i <= center && j <= right) {
      if (list[i] < list[j]) {
        tmp[left + count] = list[i];
        i++;
        count++;
      } else {
        tmp[left + count] = list[j];
        j++;
        count++;
      }
    }

    while (i <= center && j > right) {
      tmp[left + count] = list[i];
      i++;
      count++;
    }

    while (j <= right && i > center) {
      tmp[left + count] = list[j];
      j++;
      count++;
    }

    for (int k = left; k < count; k++) {
      list[k] = tmp[k];
    }
  }
}
