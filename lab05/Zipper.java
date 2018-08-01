package lab05;
import java.util.*;

public class Zipper{

  public static int[] zip(int[] arr1, int[] arr2){
    if(arr1 == null || arr2 == null){
      throw new IllegalArgumentException("Bad input");
    }
    if(arr1.length != arr2.length){
      throw new IllegalArgumentException("Not same length. Bad Input");
    }

    int totalLengthHolder = arr1.length + arr2.length;
    int[] newArray = new int[arr1.length + arr2.length];

    for(int i = 0; i<arr1.length; i++){
      newArray[i] = arr1[i];
    }
    for(int i = 0; i<arr2.length; i++){
      newArray[i+arr1.length] = arr2[i];
    }
    Arrays.sort(newArray)
;    return newArray;
  }
}
