package assignment02;


public class InstanceMethodVersion{
  private String string;

  public InstanceMethodVersion(String str){
    string = str;
  }


//this counts the amount of spaces in a string else returns -1 if none
  public int countSpaces(){
    int count = -1;
    if(string !=null){
      count = 0;
      for(int i = 0; i<string.length(); i++){
        if(string.charAt(i) == ' '){
          count++;
        }
      }
    }
    return count;
  }

// Second way to countspaces in via importing string into an array
  public int countSpaces2(){
    int count2 = 0;
    if(string == null){
      count2 = -1;
    }
    if(string != null){
      char[] arr = string.toCharArray();   //imports the string into a array
      for(int i = 0; i<arr.length; i++){
        if(arr[i] == ' '){
          count2++;
        }

      }
    }
    return count2;
  }

//returns the first string in the given argument or null/space if empty
  public String first(){
    String returnVal = null;
    if(string != null){
      returnVal = string.trim();
      int i = returnVal.indexOf(' ');
      if(i >= 0){
        returnVal = returnVal.substring(0, i);
      }
    }
    return returnVal;
  }

//returns the entrie string argument except first word
  public String rest(){
    String returnVal = null;
    if(string != null){
      returnVal = string.trim();
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
  public String withoutExtraSpaces(){

    String returnVal = null;
    if (string != null){
      returnVal = string.trim();
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
  public String[] splitOnSpaces(){

    string = withoutExtraSpaces();
    int len = countSpaces();
    String[] returnVal = null;
    if(len >=0){
      returnVal = new String[len+1];
      for(int i = 0; i < returnVal.length; i++){
        returnVal[i] = first();
        string = rest();
      }
    }
    return returnVal;
    }
//GETS LENGTH OF EACH WORD IN THE ARRAY!
  public int[] strLengths(){

    String[] test1 = splitOnSpaces();
    int[] returnVal = {};
    if(string != null && string != ""){
      returnVal = new int[test1.length];
      for(int i = 0; i<returnVal.length; i++){
      returnVal[i] = test1[i].length();
      }
    }
    if(string == null){
      returnVal = null;
    }
    return returnVal;
  }
}
