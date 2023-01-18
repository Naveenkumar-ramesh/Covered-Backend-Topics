import java.util.Iterator;
import java.util.TreeSet;

class Treeset{  
	
 public static void main(String args[]){  

    TreeSet<String> set=new TreeSet();  
//           set.add("One");    
//           set.add("Two");    
//           set.add("Three");   
//           set.add("Four");  
//           set.add("Five");  
           
           set.add("2");   
           set.add("4");  
           set.add("1");     
           set.add("3");   
           set.add("5");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}