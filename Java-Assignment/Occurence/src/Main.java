import java.util.LinkedList;
public class Main {

  public static void main(String[] args) {

     
     LinkedList<String> list1 = new LinkedList<String>();

    
     list1.add("one");
     list1.add("two");
     list1.add("three");
     list1.add("four");
     list1.add("five");
     list1.add("six");
     list1.add("seven");
 
    
     System.out.println("Linkedlist1 elements: "+list1);

 
     System.out.println("LastIndex of AA:"+list1.lastIndexOf("AA"));

     
     System.out.println("LastIndex of ZZ:"+list1.lastIndexOf("ZZ"));
  }
}