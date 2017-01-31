package Login;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList AL = new ArrayList();
		
		AL.add("Krishu");
		AL.add("Aaria");
		AL.add("Nishi");
		AL.add("Dhaval");
		
		ListIterator b = AL.listIterator();
		
		System.out.println("ArrayList: "+AL);
		System.out.println(b.nextIndex());
		System.out.println(b.next());
		System.out.println(b.next());
		System.out.println(b.next());
		System.out.println(b.next());
		System.out.println(b.nextIndex());
		System.out.println(b.previous());
		System.out.println(b.previousIndex());
		
		
		

	}

}
