package assignment02;
import java.util.Arrays;
import java.util.Optional;

public class Tester{


  public static void main(String[] args){
    System.out.println("Expected value 0");
    System.out.println(Utilities02.countNulls(null));
    Object[] test = {};
    System.out.println("Expected value 0");
    System.out.println(Utilities02.countNulls(test));

//4 Test for Utilities02.countSpaces
    System.out.println("Expected Value for null: -1 ");
    System.out.println("Value: " + Utilities02.countSpaces(null));
    System.out.println("Expected Value for empty string: 0");
    System.out.println("Value: " + Utilities02.countSpaces(""));
    System.out.println("Expected Value for no space: 0 ");
    System.out.println("Value: " + Utilities02.countSpaces("Hello"));
    System.out.println("Expected Value for multiple space: 3");
    System.out.println("Value: " + Utilities02.countSpaces("Hi! How's it going?"));
    System.out.println("-----------------------------------------------");


//4 Test for Utilities02.countSpaces2
    System.out.println("(countSpaces2) Expected Value for null: -1 ");
    System.out.println("Value: " + Utilities02.countSpaces(null));
    System.out.println("(countSpaces2) Expected Value for empty string: 0");
    System.out.println("Value: " + Utilities02.countSpaces(""));
    System.out.println("(countSpaces2) Expected Value for no space: 0 ");
    System.out.println("Value: " + Utilities02.countSpaces("Hello"));
    System.out.println("(countSpaces2) Expected Value for multiple space: 3");
    System.out.println("Value: " + Utilities02.countSpaces("Hi! How's it going?"));
    System.out.println("-----------------------------------------------");


//7 Test for Utilities02.first
    System.out.println("(first) Expected Value for null: null");
    System.out.println("Value: " + Utilities02.first(null));
    System.out.println("(first) Expected Value for empty string: ");
    System.out.println("Value: " + Utilities02.first(""));
    System.out.println("(first) Expected Value for several spaces: Hello");
    System.out.println("Value: " + Utilities02.first("Hello   there"));
    System.out.println("(first) Expected Value for leading and trailing space: Bye");
    System.out.println("Value: " + Utilities02.first(" Bye "));
    System.out.println("(first) Expected Value for no leading space: none");
    System.out.println("Value: " + Utilities02.first("none "));
    System.out.println("(first) Expected Value for string with leading/trailing: See");
    System.out.println("Value: " + Utilities02.first("  See  yah!  "));
    System.out.println("(first) Expected Value for string without leading space: Hi!");
    System.out.println("Value: " + Utilities02.first("Hi! How's it going?"));
    System.out.println("-----------------------------------------------");


//7 Test for Utilities02.rest
    System.out.println("(rest) Expected Value for null: null");
    System.out.println("Value: " + Utilities02.rest(null));
    System.out.println("(rest) Expected Value for empty string: ");
    System.out.println("Value: " + Utilities02.rest(""));
    System.out.println("(rest) Expected Value for several spaces: there");
    System.out.println("Value: " + Utilities02.rest("Hello   there"));
    System.out.println("(rest) Expected Value for single word w/ leading and trailing space: ");
    System.out.println("Value: " + Utilities02.rest(" Bye "));
    System.out.println("(rest) Expected Value for single word w/ no leading space: ");
    System.out.println("Value: " + Utilities02.rest("none "));
    System.out.println("(rest) Expected Value for string with leading/trailing: yah!");
    System.out.println("Value: " + Utilities02.rest("  See  yah!  "));
    System.out.println("(rest) Expected Value for string without leading space: How's it going!");
    System.out.println("Value: " + Utilities02.rest("Hi! How's it going?"));
    System.out.println("-----------------------------------------------");


//few tests for Utilities02.withoutExtraSpaces
    System.out.println("(withoutExtraSpaces) Expected Value for several spaces: Hello there");
    System.out.println("Value: " + Utilities02.withoutExtraSpaces("Hello   there"));
    System.out.println("(withoutExtraSpaces) Expected Value for string with leading/trailing: See yah!");
    System.out.println("Value: " + Utilities02.withoutExtraSpaces("  See  yah!  "));
    System.out.println("(withoutExtraSpaces) Expected Value for string with leading space: Hi! How's it going!");
    System.out.println("Value: " + Utilities02.withoutExtraSpaces("  Hi! How's it going?"));
    System.out.println("-----------------------------------------------");

//3 test for Utilities02.splitOnSpaces
    System.out.println("(splitOnSpaces) Expected Value for null: null");
    System.out.println("Value: " + Arrays.toString(Utilities02.splitOnSpaces(null)));
    System.out.println("(splitOnSpaces) Expected Value for empty string: []");
    System.out.println("Value: " + Arrays.toString(Utilities02.splitOnSpaces("")));
    System.out.println("(splitOnSpaces) Expected Value for plenty of word and space: [Hi!, How's, it, going?]");
    System.out.println("Value: " + Arrays.toString(Utilities02.splitOnSpaces("Hi! How's it going?")));
    System.out.println("-----------------------------------------------");


//3 test for Utilities02.strLengths
    System.out.println("(strLengths) Expected Value for null: null");
    System.out.println("Value: " + Arrays.toString(Utilities02.strLengths(null)));
    System.out.println("(strLengths) Expected Value for empty string: []");
    System.out.println("Value: " + Arrays.toString(Utilities02.strLengths("")));
    System.out.println("(strLengths) Expected Value for plenty of word and space: [3, 5, 2, 1, 6]");
    System.out.println("Value: " + Arrays.toString(Utilities02.strLengths("Hi! How's it s    going?")));
    System.out.println("-----------------------------------------------");

// test for Utilities02.splitOnSpaces1
  System.out.println("Optional test\n");
    Optional<String[]> array = Utilities02.splitOnSpaces1(" should give an array of   these words  separated by commas   ");
      if(array.isPresent()) {
	       System.out.println(Arrays.toString(array.get()));
       } else {
	        System.out.println("The input was null or empty");
        }
    Optional<String[]> array1 = Utilities02.splitOnSpaces1(null);
      if(array1.isPresent()) {
    	    System.out.println(Arrays.toString(array.get()));
        } else {
    	      System.out.println("The input was null or empty");
          }
    Optional<String[]> array2 = Utilities02.splitOnSpaces1("");
      if(array2.isPresent()) {
          System.out.println(Arrays.toString(array.get()));
        } else {
            System.out.println("The input was null or empty");
          }
    System.out.println("-----------------------------------------------");
    System.out.println("-----------------------------------------------");


//InstanceMethodVersion tests for countSpace
    System.out.println("TESTS FOR InstanceMethodVersion\n");

//creating new objects for tests:
    InstanceMethodVersion nullCheck = new InstanceMethodVersion(null);
    InstanceMethodVersion emptyCheck = new InstanceMethodVersion("");
    InstanceMethodVersion singleCheck = new InstanceMethodVersion("Hello");
    InstanceMethodVersion multiCheck = new InstanceMethodVersion("Hello there Mr.  ");
    InstanceMethodVersion spaceCheck = new InstanceMethodVersion("  Hi there");
    InstanceMethodVersion spaceCheck2 = new InstanceMethodVersion("  See  yah!  ");
    InstanceMethodVersion spaceCheck3 = new InstanceMethodVersion(" Hello ");
    System.out.println("countSpace tests");

    System.out.println("Expected value for null: -1 ");
    System.out.println(nullCheck.countSpaces());

    System.out.println("Expected value for empty string: 0 ");
    System.out.println(emptyCheck.countSpaces());


    System.out.println("Expected value for single word: 0 ");
    System.out.println(singleCheck.countSpaces());

    System.out.println("Expected value for multiple space: 4 ");
    System.out.println(multiCheck.countSpaces());
    System.out.println("-----------------------------------------------");

    System.out.println("countSpace2 tests\n");

    System.out.println("Expected value for null: -1 ");
    System.out.println(nullCheck.countSpaces2());

    System.out.println("Expected value for empty string: 0 ");
    System.out.println(emptyCheck.countSpaces2());


    System.out.println("Expected value for single word: 0 ");
    System.out.println(singleCheck.countSpaces2());

    System.out.println("Expected value for multiple space: 4 ");
    System.out.println(multiCheck.countSpaces2());
    System.out.println("-----------------------------------------------");

    System.out.println("withoutExtraSpaces test");

    System.out.println("Expected Value for several spaces: Hello there Mr.");
    System.out.println("Value: " + multiCheck.withoutExtraSpaces());


    System.out.println("(withoutExtraSpaces) Expected Value for string with leading/trailing: See yah!");
    System.out.println("Value: " + spaceCheck2.withoutExtraSpaces());


    System.out.println("(withoutExtraSpaces) Expected Value for string with leading space: Hi there");
    System.out.println("Value: " + spaceCheck.withoutExtraSpaces());
    System.out.println("-----------------------------------------------");


    System.out.println("first test\n");

    System.out.println("(first) Expected Value for null: null");
    System.out.println("Value: " + nullCheck.first());
    System.out.println("(first) Expected Value for empty string: ");
    System.out.println("Value: " + emptyCheck.first());
    System.out.println("(first) Expected Value for several spaces: Hello");
    System.out.println("Value: " + multiCheck.first());
    System.out.println("(first) Expected Value for leading and trailing space: Hello");
    System.out.println("Value: " + spaceCheck3.first());
    System.out.println("(first) Expected Value for no leading space: Hello");
    System.out.println("Value: " + singleCheck.first());
    System.out.println("(first) Expected Value for string with leading/trailing: See");
    System.out.println("Value: " + spaceCheck2.first());
    System.out.println("(first) Expected Value for string without leading space: Hello");
    System.out.println("Value: " + multiCheck.first());
    System.out.println("-----------------------------------------------");

    System.out.println("rest test\n");

    System.out.println("(rest) Expected Value for null: null");
    System.out.println("Value: " + nullCheck.rest());
    System.out.println("(rest) Expected Value for empty string: ");
    System.out.println("Value: " + emptyCheck.rest());
    System.out.println("(rest) Expected Value for several spaces: there Mr.");
    System.out.println("Value: " + multiCheck.rest());
    System.out.println("(rest) Expected Value for a word w/ leading and trailing space: ");
    System.out.println("Value: " + spaceCheck3.rest());
    System.out.println("(rest) Expected Value for single word w/no leading space: ");
    System.out.println("Value: " + singleCheck.rest());
    System.out.println("(rest) Expected Value for string with leading/trailing: yah!");
    System.out.println("Value: " + spaceCheck2.rest());
    System.out.println("(rest) Expected Value for string without leading space: there Mr.");
    System.out.println("Value: " + multiCheck.rest());
    System.out.println("-----------------------------------------------");

    System.out.println("splitOnSpaces test\n");

    System.out.println("(splitOnSpaces) Expected Value for null: null");
    System.out.println("Value: " + Arrays.toString(nullCheck.splitOnSpaces()));
    System.out.println("(splitOnSpaces) Expected Value for empty string: []");
    System.out.println("Value: " + Arrays.toString(emptyCheck.splitOnSpaces()));
    System.out.println("(splitOnSpaces) Expected Value for plenty of word and space: [Hello, there, Mr.]");
    System.out.println("Value: " + Arrays.toString(multiCheck.splitOnSpaces()));
    System.out.println("-----------------------------------------------");
  }
}
