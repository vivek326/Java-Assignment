import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
 public static void main(String[] args) {
    LinkedList<String> list1 = new LinkedList<String>();
    list1.add("Harry");
    list1.add("Jack");
    list1.add("Tim");
    list1.add("Rick");
    list1.add("Rock");
    
    for (String s: list1) {
    	System.out.println(s);
    }

    List<String> list = new ArrayList<String>(list1);

    for (String str : list){
      System.out.println(str);
    }
 }
}