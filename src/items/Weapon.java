package items;

public class Weapon extends Item
{
	public int damage;
	public int handedness;
	public boolean lefthand;
	
	public Weapon(String name, double value, float weight) 
	{
		super(name, value, weight);
	}
}
