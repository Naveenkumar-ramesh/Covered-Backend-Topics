import java.util.HashSet;
import java.util.Iterator;


class Hashset{  
	
 public static void main(String args[]){  

    HashSet<String> set=new HashSet();  

           set.add("ab");    
           set.add("b");    
           set.add("y");   
           set.add("g");  
           set.add("a");  
           Iterator<String> i=set.iterator();  
           
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}