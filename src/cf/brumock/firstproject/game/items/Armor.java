package cf.brumock.firstproject.game.items;

public class Armor extends Item
{
	public enum Slot
	{
		HEAD,
		SHOULDERS,
		CHEST,
		ARMS,
		WRISTS,
		LEGS,
		FEET
	}
	
	public int armorRating;
	
	public Armor(String name, double value, float weight) 
	{
		super(name, value, weight);
	}
}
