package polymorphism;

public class PolymorphismClicker {

	public static void main(String[] args) {

		Human h = new Student();
		print(h);		
	}
	
	static void print(Object x) {
		System.out.println("1) Object");
	}
	
	static void print(Human x) {
		System.out.println("2) ");
		x.foo();
	}
	
	static void print(Student x) {
		System.out.println("3) ");
		x.foo();
	}

}

class Human{
	
	void foo()
	{
		System.out.println("Human");
	
	}
}

class Student extends Human{
	
	void foo()
	{
		System.out.println("Student");			
	}
}