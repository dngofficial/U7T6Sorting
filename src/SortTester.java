import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72};
      System.out.println(arr1.length);
    int counter1 = Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
    System.out.println("Selection sort iteration counter: " + counter1);
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72};
    System.out.println(arr2.length);
    int counter2 = Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
    System.out.println("Selection sort iteration counter: " + counter2);
  }
}
