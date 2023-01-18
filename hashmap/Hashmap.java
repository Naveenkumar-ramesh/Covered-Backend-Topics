import java.util.HashMap;
import java.util.Map;

class Hashmap{  
	
    public static void main(String args[]){  
	 
    	HashMap<Integer,String> map=new HashMap<Integer,String>();    
        map.put(100,null);    
        map.put(102,"b");   
        map.put(101,"c");  
        map.put(101,null);    
        map.put(null,"a");    
        
        for (Map.Entry m:map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
        }    
    }  
}  