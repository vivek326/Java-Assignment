
import java.util.LinkedList; 
  
public class Main { 
   public static void main(String args[]) { 
  
     
      LinkedList list1 = new LinkedList(); 
  
      // use add() method to add elements in the list 
      list1.add("Geeks"); 
      list1.add("for"); 
      list1.add("Geeks"); 
      list1.add("10"); 
      list1.add("20"); 
  
      // Output the present list 
      System.out.println("The list is:" + list1); 
  
      // Adding new elements to the end 
      list1.add("Hello"); 
      list1.add("End"); 
  
      // printing the new list 
      System.out.println("The new List is:" + list1); 
   } 
}