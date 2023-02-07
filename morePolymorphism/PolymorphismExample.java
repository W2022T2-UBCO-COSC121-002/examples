package morePolymorphism;

public class PolymorphismExample {
	
	PolymorphismExample()
	{
		
	}

	
	public String toString() {
		System.out.println("hi");
		return "hi";
	}
	
	public static void main(String[] args){
		Student s = new GradStudent();
	
		s.getName();
		
	}
}

class Human{
	public void getName()
	{
		System.out.println("Human");
	}
}

class Student extends Human {
	public void getName()
	{
		System.out.println("Student");
	}
	public void getGpa()
	{}
}

class GradStudent extends Student{
//	public void getName()
//	{
//		System.out.println("Grad Student");
//	}
	
	public void getDegree()
	{}
}