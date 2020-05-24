package cf.brumock.firstproject.game.character;

import java.util.List;

import cf.brumock.firstproject.main.Main;

public class Character 
{
	public String name;
	public int level;
	public float experience;
	public Stats stats;
	public String race;
	public boolean prodigy;
	public List<Skill> skills;
	public List<Magic> magicks;
	
	public Inventory inventory;
	
	public Character() 
	{
		stats = new Stats();
		
		level = 0;
		experience = 0f;
		
		// Core Stats
		stats.core.charisma = 1;
		stats.core.constitution = 1;
		stats.core.dexterity = 1;
		stats.core.intelligence = 1;
		stats.core.strength = 1;
		stats.core.wisdom = 1;
		
		// Specific Stats
		stats.specific.animalHandling = 0;
		stats.specific.crafting = 0;
		stats.specific.cryomancy = 0;
		stats.specific.engineering = 0;
		stats.specific.firstAid = 0;
		stats.specific.longRifles = 0;
		
		int generated = Main.random.nextInt(1000001);
		
		prodigy = generated == 25 ? true : false;
	}
	
	@Override
	public String toString() {
		String output = "Name: " + name + '\n' +
				        "Race: " + race;
		
		return output;
	}
}
