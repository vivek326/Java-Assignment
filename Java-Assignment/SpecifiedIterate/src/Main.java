import java.util.LinkedList;
import java.util.Iterator;

  public class Main {
  public static void main(String[] args) {
    
	  
     LinkedList<String> l_list = new LinkedList<String>();
   
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("White");
          l_list.add("Pink");

   Iterator p = l_list.listIterator(2);

   
   while (p.hasNext()) {
   System.out.println(p.next());
   }
   }
}