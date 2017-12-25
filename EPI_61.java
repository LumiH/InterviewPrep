// O(n)-time solution to problem 6.1 in Elements of Programming Interviews(EPI)
//Dutch National Flag problem
public class EPI_61 {

  static void QuickSort(int[] A, int i) {
    //partition the array with A[i] as a pivot
    int pivot = A[i];
    int tempInt1 = A[i];
    A[i] = A[A.length - 1];
    A[A.length - 1] = tempInt1;
    int j = -1;
    for (int k = 0; k < A.length - 1; k++) {
      if (A[k] <= pivot) {
        j++;
        int tempInt = A[j];
        A[j] = A[k];
        A[k] = tempInt;
      }
    }
    //send all of the elements equal to pivot to the end of the subarray (i.e. to the middle of the array)
    int pivotIndex = j + 1;
    int tempInt2 = A[j + 1];
    A[j + 1] = A[A.length - 1];
    A[A.length - 1] = tempInt2;
    int s = -1;
    for (int k = 0; k < pivotIndex; k++) {
      if (A[k] < pivot) {
        s++;
        int tempInt = A[s];
        A[s] = A[k];
        A[k] = tempInt;
      }
    }
  }
  public static void main(String[] args) {

    int[] array = new int[]{2,1, 5, 3, 6, 9, 3, 4, 2};
    if (array.length > 1) {
      QuickSort(array, 2);
      for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
      }
    }
    else {
      for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
      }
    }
  }
}
