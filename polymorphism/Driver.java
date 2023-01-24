package polymorphism;

public class Driver {
	
	public static void print(Object o)
	{
		if (o instanceof Parent)
		{
			((Parent)o).printType();
		}
		else
		{
			System.out.println("This object doesn't support printType() ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		
		Object p1 = new Child();
		Object p2 = new Grandchild();
		Object sc = new SecondChild();
		
		
		
		print(p1);
		print(p2);
		print(sc);
		
//		double d = 10.334;
//		
//		int i = (int)d;
	}

}
