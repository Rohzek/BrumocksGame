package cf.brumock.firstproject.game.character;

public class Stats 
{
	public Core core;
	public Specific specific;
	public int hitPoints;
	
	public Stats() 
	{
		core = new Core();
		specific = new Specific();
	}
	
	public class Core
	{
		public int strength;
		public int dexterity;
		public int constitution;
		public int intelligence;
		public int wisdom;
		public int charisma;
	}
	
	public class Specific
	{
		public int firstAid;
		public int crafting;
		public int cryomancy;
		public int engineering;
		public int animalHandling;
		public int longRifles;
	}
}
