import java.util.*; 
  
public class Main { 
    public static void main(String[] args) 
    { 
        // Create a TreeSet and inserting elements 
        SortedMap<Integer, String> map1 = new TreeMap<>(); 
  
        // Adding Element to SortedSet 
        map1.put(1, "java"); 
        map1.put(2, "c"); 
        map1.put(3, "jquery"); 
        map1.put(4, ".net"); 
        
  
        // Returning the key ranging 
        // between 2 and 5 
        System.out.print("Elements in range from 1 to 4 in map are : "
                         + map1.subMap(1, 4)); 
    } 
} 