import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist{
  public static void main(String args[]){
    ArrayList<String> arrayList=new ArrayList<>();
    arrayList.add("Apple");
    arrayList.add("Orange");
    arrayList.add("Banana");

    System.out.println("ArrayList elements: ");

    Iterator<String> it=arrayList.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}