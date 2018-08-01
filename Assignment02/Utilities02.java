package assignment02;
import java.util.Arrays; //imported to test and print strings!
import java.util.Optional;

public class Utilities02{

//returns number of null value in the array
  public static int countNulls(Object[] array){
    int nullCount = 0;
    if(array != null && array.length != 0){
      for(int i = 0; i<array.length; i++){
        if (array[i] == null){
          nullCount++;
        }
      }
    }
    return nullCount;
  }
//this counts the amount of spaces in a string else returns -1 if none
  public static int countSpaces(String str){
    int count = -1;
    if(str !=null){
      count = 0;
      for(int i = 0; i<str.length(); i++){
        if(str.charAt(i) == ' '){
          count++;
        }
      }
    }
    return count;
  }

// Second way to countspaces in via importing string into an array
  public static int countSpaces2(String str){
    int count2 = -1;
    if(str != null){
      char[] arr = str.toCharArray();   //imports the string into a array
      for(int i = 0; i<arr.length; i++){
        if(arr[i] == ' '){
          count2++;
        }

      }
    }
    return count2;
  }

//returns the first string in the given argument or null/space if empty
  public static String first(String str){
    String returnVal = null;
    if(str != null){
      returnVal = str.trim();
      int i = returnVal.indexOf(' ');
      if(i >= 0){
        returnVal = returnVal.substring(0, i);
      }
    }
    return returnVal;
  }

//returns the entrie string argument except first word
  public static String rest(String str){
    String returnVal = null;
    if(str != null){
      returnVal = str.trim();
      int i = returnVal.indexOf(' ');
      if(i>= 0){
        returnVal = returnVal.substring(i+1).trim();
      }
      else{
        returnVal = "";
      }
    }
    return returnVal;
  }

//REMOVES ANY EXTRA SPACES IN THE STRING!
  public static String withoutExtraSpaces(String str){
    String returnVal = null;
    if (str != null){
      returnVal = str.trim();
      int len1 = 0;
      int len2 = 0;
      do {
        len1 = returnVal.length();
        returnVal = returnVal.replace("  ", " ");
        len2 = returnVal.length();
      }
      while(len2 < len1);
    }
    return returnVal;
  }

//Creates an array out of the string arguments passed!
  public static String[] splitOnSpaces(String str){
    int len = countSpaces(withoutExtraSpaces(str));
    String[] returnVal = null;
    if(len >=0){
      returnVal = new String[len+1];
      for(int i = 0; i < returnVal.length; i++){
        returnVal[i] = first(str);
        str = rest(str);
      }
    }
    return returnVal;
    }
//GETS LENGTH OF EACH WORD IN THE ARRAY!
  public static int[] strLengths(String str){
    String[] test1 = splitOnSpaces(str);
    int[] returnVal = {};
    if(str != null && str != ""){
      returnVal = new int[test1.length];
      for(int i = 0; i<returnVal.length; i++){
      returnVal[i] = test1[i].length();
      }
    }
    if(str == null){
      returnVal = null;
    }
    return returnVal;
  }

  public static Optional<String[]> splitOnSpaces1(String str){
    String[] returnVal = null;
    if (str != null && str.trim().length() > 0){
      returnVal = new String[str.length()];
      int index = 0;
      while(str.length() !=0){
        returnVal[index] = first(str);
        str = rest(str);
        index += 1;
      }
      returnVal = Arrays.copyOf(returnVal, index);
      return Optional.of(returnVal);
    }
    else return Optional.empty();
  }


/**
public static void main(String[] args){
  String[] array1 = {"he", "asd", null," ", "ads"};
  String gypsy = "Whats up everyone";
  Utilities02 test = new Utilities02();
  System.out.println(test.countNulls(array1));
  System.out.println(test.withoutExtraSpaces(gypsy));
  System.out.println(Arrays.toString(test.splitOnSpaces(gypsy))); // print string
  System.out.println(Arrays.toString(test.strLengths(gypsy)));
  //System.out.println(Arrays.toString(test.splitOnSpaces1(gypsy)));
  Optional<String[]> array = Utilities02.splitOnSpaces1("");
if(array.isPresent()) {
	System.out.println(Arrays.toString(array.get()));
} else {
	System.out.println("The input was null or empty");
}
}
//*/
}
