import java.util.*;
//import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		
		 
//			System.out.println("Enter Array elements");
//			Scanner in = new Scanner(System. in);
//			String s= in.nextLine();
//			list_Strings.add(s);
//			
//			System.out.println(list_Strings);
		
		list1.add("cricket");
		list1.add("football");
		list1.add("base");
		list1.add("basket");
		
		
		System.out.println(list1);
		
		list1.add(0, "gym");
		
		
		System.out.println(list1);

	}

}


