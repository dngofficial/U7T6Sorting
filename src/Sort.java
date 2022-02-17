import java.util.ArrayList;

public class Sort
{
  // Part A.  Which Sort is Which?
  public static int selectionSort(int[] elements)
  {
    int counter = 0;
    for (int j = 0; j < elements.length - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        counter++;
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }

      //replacement/swapping
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;

    }

    return counter;
  }

  // Part A.  Which Sort is Which?
  public static int insertionSort(int[] elements)
  {
    int counter = 0;
    for (int j = 1; j < elements.length; j++)
    {
      int temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
      {
        counter++;
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;

      }
      elements[possibleIndex] = temp;

    }
    return counter;
  }
  
  // Part C.  Sorting a 1000-word list!
  public static void selectionSortWordList(ArrayList<String> words)
  {
    int counter = 0;
    for (int j = 0; j < words.size()- 1; j++)
    {
      int minIndex = j; // minimum idx that will updated as a new minimum is found
      for (int k = j + 1; k < words.size(); k++)
      {
        counter++;
        if (words.get(k).compareTo(words.get(minIndex)) < 0) //comparing current value to current minimum
        {
          minIndex = k;
        }
      }
      //replacement/swapping
      String temp = words.get(j);
      words.set(j, words.get(minIndex));
      words.set(minIndex, temp);
    }
    System.out.println("--------------------------------------");
    System.out.println("Selection sort iteration loop counter: " + counter);
    System.out.println("--------------------------------------");


  }

  // Part C.  Sorting a 1000-word list!
  public static void insertionSortWordList(ArrayList<String> words)
  {
    int counter = 0;
    for (int j = 1; j < words.size(); j++)
    {
      String temp = words.get(j);
      int idx = j;
      while (idx > 0 && temp.compareTo(words.get(idx -1)) < 0)
      {
        counter++;
        words.set(idx, words.get(idx-1));
        idx--;
      }
      words.set(idx, temp);
    }
    System.out.println("--------------------------------------");
    System.out.println("Insertion sort iteration loop counter: " + counter);
    System.out.println("--------------------------------------");
  }
}