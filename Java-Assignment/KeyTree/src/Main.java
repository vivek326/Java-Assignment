import java.util.*;  
public class Main {  
   public static void main(String args[]){  
  
  // Create a tree map
   TreeMap<String,String> treemap=new TreeMap<String,String>();      
  
  // Put elements to the map 
  treemap.put("a1", "java");
  treemap.put("a2", "c");
  treemap.put("a3", "C++");
  treemap.put("a4", ".net"); 
    
  System.out.println(treemap);
        if(treemap.containsKey("a1")){
            System.out.println("The Tree Map contains key a1");
        } else {
            System.out.println("The Tree Map does not contain key a1");
        }
        if(treemap.containsKey("a5")){
            System.out.println("The Tree Map contains key a5");
        } else {
            System.out.println("The TreeMap does not contain key a5");
        }
    }
}
