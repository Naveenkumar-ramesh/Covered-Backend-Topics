import java.util.Map;
import java.util.TreeMap;

class Treemap{  
	
    public static void main(String args[]){  
	 
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
        map.put(100,null);    
        map.put(102,null);   
        map.put(101,null);  
        map.put(101,"d");    
        map.put(103,"a");    
        
        for (Map.Entry m:map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
        }    
    }  
}  