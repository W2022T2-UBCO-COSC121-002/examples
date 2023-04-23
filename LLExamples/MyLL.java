package LLExamples;

import java.util.Iterator;

public class MyLL<E>{

	private int size=0;
	
	private Node<E> head = null, tail = null;
	
	//METHODS:
	public boolean isEmpty() {
		if (size != 0)
			return false;
		else 
			return true;
	}
	public int size() {
		return this.size;
	}
	
	public void addFirst(E element) {
		if(isEmpty())  //list is empy
		{
			head =  new Node<E>(element);
			tail = head;
			this.size++;
		}
		else
		{
			 Node <E> newHead = new Node<E>(element);
			 newHead.next = head;		//update the link to the old head
			 head = newHead;
			 this.size++;

		}
		
	}
	public void addLast(E element) {
		if(isEmpty())  //list is empy
		{
			tail =  new Node<E>(element);
			head = tail;
			this.size++;

		}
		else
		{
			 Node <E> newTail= new Node<E>(element);
			 tail.next = newTail;
			 tail = newTail;  // tail = tail.next;
			 this.size++;

		}
	}
	
	public void add(E element)
	{
		this.addLast(element);
	}
	
	public void add(int index, E element) {
		if (index < 0 || index >= this.size()) throw new IndexOutOfBoundsException();
		
		if (index == 0)
			this.addFirst(element);
		else if (index == this.size() - 1)
			this.addLast(element);
		else 
		{
			Node<E> current = head;
			Node<E> previous = null;
			int currentIndex = 0;
			while (currentIndex < index)
			{
				previous = current;
				current = current.next;
				currentIndex ++;
			}
			Node<E> newNode = new Node<E>(element);
			newNode.next = current;
			previous.next = newNode;
		}
		

	}
	public E getFirst()
	{
		return head.element;
	}
	public E getLast()
	{
		return tail.element;
	}

public E removeFirst()
{
	if (this.isEmpty()) return null;
	else {
		if (this.size == 1)
		{
			Node<E> nodeToReturn = head;
			head = tail = null;
			size = 0;
			return nodeToReturn.element;
		}
		{
			Node<E> nodeToReturn = head;
			head = head.next;
			nodeToReturn.next = null;
			size--;
			return nodeToReturn.element;
		}
	}
}
	public E removeLast()
	{
		if (this.isEmpty()) return null;
		else {
			if (this.size == 1)
			{
				Node<E> nodeToReturn = tail;
				head = tail = null;
				size = 0;
				return nodeToReturn.element;
			}
			{
				Node<E> nodeToReturn = tail;
				
				Node<E> current = head;
				while (current.next != tail)
					current = current.next;
				
				current.next = null;
				
				tail = current;
				nodeToReturn.next = null;
				size--;
				return nodeToReturn.element;
			}
		}
	}
	
	public E remove(int index)
	{
		if (index < 0 || index >= this.size()) throw new IndexOutOfBoundsException();
		
		if (index ==0 ) return this.getFirst();
		if (index == this.size()-1) return this.getLast();
		

		Node<E> current = head;
		Node<E> previous = null;
		
		int currentIndex = 0;
		while (currentIndex < index)
		{
			previous = current;
			current = current.next;
			currentIndex ++;
		}
		
		Node<E> nodeToReturn = current;
		previous.next = current.next;
		nodeToReturn.next = null;
		size--;
		return nodeToReturn.element;
	}

	
	public Iterator<E> iterator(){
		return new MyIterator();
	}
	
	class MyIterator implements Iterator<E>{
		private Node<E> current = head;
		
	public boolean hasNext() {
			return (current != null);
		}
		public E next() {
			E tmp = current.element;
			current = current.next;
			return tmp;
		}
	}

	
	//NODE – This is an inner class that is contained 			 //within out LinkedList
	class Node<E> {
			E element;
			Node<E> next;
			public Node(E e) {  element = e;  }
	}



}

 

