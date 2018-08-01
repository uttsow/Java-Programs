package assignment04;
import java.util.*;

public class Demo{
  public static void main(String[] args){

    //Inital display:

    System.out.println("Answer: I am was born in Bangladesh in South Asia");
    System.out.println("_____________________________________________");
    String question = new String("What country and Continent was I born in?");
    FlexibleChoiceQuestion example = new FlexibleChoiceQuestion(question);

    example.addChoice("Bangladesh");
    example.addChoice("Europe");
    example.addChoice("New York City");
    example.addChoice("North America");
    example.addChoice("Argentina");
    example.addChoice("South America");
    example.addChoice("India");
    example.addChoice("Asia");
    example.addChoice("Korea");
    example.addChoice("Antartica");
//add the answers:

    example.addAnswer(1);
    example.addAnswer(8);

//Display;
    example.presentQuestion();
  }
}
