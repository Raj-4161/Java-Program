package vectorandstack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
	
		//put object type of data
		
		// 1. add 
		Vector<Object> list= new Vector<Object>();
		
		 list.add("Apple");
	     list.add("Banana");
	     list.add("Cherry");
	     list.add("Banana"); // duplicate allowed
	     System.out.println("Initial List: " + list);
		
		
		 // 2. get() - Access element by index
        System.out.println("Element at index 1: " + list.get(1));

        // 3. set() - Replace element at index
        list.set(2, "Mango");
        System.out.println("After set(): " + list);

        // 4. remove(index) - Remove element by index
        list.remove(0);
        System.out.println("After remove(0): " + list);

        // 5. indexOf() - First occurrence
        System.out.println("Index of Banana: " + list.indexOf("Banana"));

        // 6. lastIndexOf() - Last occurrence
        System.out.println("Last index of Banana: " + list.lastIndexOf("Banana"));

        // 7. contains() - Check existence
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // 8. size() - Number of elements
        System.out.println("Size: " + list.size());

        // 9. isEmpty() - Check if empty
        System.out.println("Is empty? " + list.isEmpty());
        

		//using itetrator 
		Iterator<Object> itr= list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

        // 10. listIterator() - Traverse forward & backward
        ListIterator<Object> itr1 = list.listIterator();
        System.out.println("Forward traversal:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Backward traversal:");
        while (itr1.hasPrevious()) {
            System.out.println(itr1.previous());
        }

        // 11. subList() - Extract portion
        List<Object> sub = list.subList(0, 2);
        System.out.println("SubList(0,2): " + sub);

		
		
		//using class  --create another class User and access using Vector<>
//		Vector<User> user= new Vector<User>();
//		
//		user.add(new User(1,"Raj"));
//		
//		user.add(new User(1,"Xyz"));
		
		
		
		//print using ListIterator of class variables
//		ListIterator<User> u= user.listIterator();
//		
//		while(u.hasNext()) {
//			
//			
//			System.out.println(u.next());
//		}
		
		
		
		
	}

}
