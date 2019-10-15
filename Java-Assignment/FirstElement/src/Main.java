import java.util.*;
public class Main {
 public static void main(String[] args) {
 
  LinkedList <String> lang = new LinkedList <String> ();
          lang.add("java");
          lang.add("c");
          lang.add("php");
          lang.add("python");
          
          
     System.out.println("Original linked  list: " + lang);
           
     System.out.println("Removed element: "+lang.pop());
     
     System.out.println("Linked list after pop: "+lang);
  }
} 