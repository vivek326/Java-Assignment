import java.util.*;
import java.util.Map.Entry;  
public class Main {  
       public static void main(String args[]) {

  // Create a tree map
  TreeMap < Integer, String > treemap = new TreeMap < Integer, String > ();

  // Put elements to the map 
  treemap.put(10, "Red");
  treemap.put(20, "Green");
  treemap.put(40, "Black");
  treemap.put(50, "White");
  treemap.put(60, "Pink");

  System.out.println("Orginal TreeMap content: " + treemap);
  System.out.println("Checking the entry for 10: ");
  System.out.println("Key(s): " + treemap.headMap(10));
  System.out.println("Checking the entry for 30: ");
  System.out.println("Key(s): " + treemap.headMap(30));
  System.out.println("Checking the entry for 70: ");
  System.out.println("Key(s): " + treemap.headMap(70));
 }
}
