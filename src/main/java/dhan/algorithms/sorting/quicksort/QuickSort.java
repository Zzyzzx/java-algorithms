package dhan.algorithms.sorting.quicksort;

public class QuickSort {

  public void sort(Integer[] list) {
    quickSort(list, list.length - 1, 0, list.length - 1);
  }

  public void quickSort(Integer[] list, int pivot, int left, int right) {
    if (left < right) {
      int pivotPosition = partition(list, right, left, right);
      quickSort(list, pivotPosition, left, pivotPosition - 1);
      quickSort(list, pivotPosition, pivotPosition + 1, right);
    }
  }

  public int partition(Integer[] list, int pivot, int left, int right) {
    int i = left;
    int j = left + 1;

    while (j < right) {
      if (list[i] < list[pivot]) {
        i++;
        j = i + 1;
        if (j < right) {
          return i;
        }
      } else if (list[j] < list[pivot]) {
        swap(list, i, j);
        i++;
        j = i + 1;
      } else {
        j++;
      }
    }

    swap(list, pivot, i);
    return i;
  }

  public void swap(Integer[] list, int a, int b) {
    int temp = list[a];
    list[a] = list[b];
    list[b] = temp;
  }
}
