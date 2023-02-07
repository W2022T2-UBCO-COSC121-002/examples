package interfaces;

public class Cat implements Animal {

	private boolean isAlive;
	
	Cat()
	{
		isAlive = true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		
		System.out.println(c.checkLifeStatus());
		c.makeNoise();
	}

	@Override
	public void makeNoise() {
		System.out.println("Meow!!");
	}
	
	public boolean checkLifeStatus()
	{
		return this.isAlive;
	}
}
