package assignment03;

public class Node{

  private int value;
  private Node next;

  public Node(int aValue){
    value = aValue;
  }

  public void setNext(Node aNode){
    next = aNode;
  }

  public int getValue(){
    return value;
  }

  public Node getNext(){
    return next;
  }

}
