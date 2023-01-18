import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist{
  public static void main(String args[]){
    LinkedList<String> linkList=new LinkedList<>();
    linkList.add("Apple");
    linkList.add("Orange");
    linkList.add(0, "Banana");

    System.out.println("LinkedList elements: ");

    Iterator<String> it=linkList.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}