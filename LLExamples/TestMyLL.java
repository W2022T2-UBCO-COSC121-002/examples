package LLExamples;

import java.util.Iterator;

public class TestMyLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLL<String> myll = new MyLL<String>();
		System.out.println(myll.size());
		
		myll.add("Cat");	
		myll.add("Dog");
		
		Iterator<String> it = myll.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println();
		
		myll.add("Fish");

		it = myll.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println();

		
		myll.add(0, "Cat2");
		
		it = myll.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());

		System.out.println();

		
		myll.add(3, "Fish2");
		
		it = myll.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println();

		myll.removeFirst();
		
		it = myll.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		
		System.out.println();

		myll.removeLast();
		
		it = myll.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println();
		
		myll.removeLast();
		
		it = myll.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println();
		
		myll.add("Cat2");
		myll.add("Dog2");

		it = myll.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println();
		
		myll.remove(1);
        
		it = myll.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println();
		
		myll.remove(1);
        
		it = myll.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println();
		

	}

}
