package interfaces;

public interface Animal {

	boolean isAlive = false;
	
	public abstract void makeNoise();   //need to make sure to have implementation when implemented
	
	public default boolean checkLifeStatus()
	{
		return isAlive;
	}
}

	
	
