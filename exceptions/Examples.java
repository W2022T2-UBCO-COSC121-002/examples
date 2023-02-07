package exceptions;

public class Examples {
	public static void main(String[] args) {
		try {
		   System.out.print(1/0);
		   System.out.print("Try ");
		} catch (NullPointerException ex) {
		   System.out.print("Catch ");
		} finally {
		   System.out.print("Finally ");
		}
		System.out.print("Bye ");
	  }


}
