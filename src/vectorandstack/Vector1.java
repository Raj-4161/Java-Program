package vectorandstack;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
	
		
		Vector<Object> v= new Vector<Object>();
		
		
		v.add(123);
		
		v.add("Raj");
		
		v.add(12.344);
		
		
		Iterator<Object> itr= v.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
