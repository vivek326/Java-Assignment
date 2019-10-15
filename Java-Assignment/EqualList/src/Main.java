import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
      ArrayList<String> list1 = new ArrayList<String>();
      list1.add("a1");
      list1.add("a2");
      list1.add("a3");
      list1.add("a4");
      
      ArrayList<String> list2 = new ArrayList<String>();
      list2.add("b1");
      list2.add("b2");
      list2.add("b3");
      list2.add("b4");
      System.out.println(list2);
      System.out.println(list1.equals(list2));
   }
}