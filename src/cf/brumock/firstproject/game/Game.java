package cf.brumock.firstproject.game;

import cf.brumock.firstproject.game.character.Character;
import cf.brumock.firstproject.game.character.Stats;
import cf.brumock.firstproject.main.Main;

public class Game 
{
	public static Character character = new Character();
	public Setup setup = new Setup();
	public Options options = new Options();
	
	public Game() {}
	
	
	public class Setup
	{
		public void RunSetup() 
		{
			boolean setupCharacter = true;
			
			System.out.println("Are you playing with explosive dice?");
			options.explosiveDice = (Main.scanner.nextLine().toLowerCase().equals("yes") ? true : false);
			
			while(setupCharacter) 
			{	
				System.out.println("What is your character's name?");
				character.name = Main.scanner.nextLine();
				
				System.out.println("What is your character's race?");
				System.out.println("Options: Hume, Taru");
				character.race = Main.scanner.nextLine();
				
				System.out.println("");
				System.out.println(character);
				
				System.out.println("\nDo you want to play as this character? yes/no");
				boolean startGame = Main.scanner.nextLine().toLowerCase().equals("yes") ? true : false;
				
				if(startGame) 
				{
					setupCharacter = false;
				}
				else 
				{
					System.out.println("");
				}
			}
			
			System.out.println("\nStarting game");
		}
		
		public void displayStats() {
			System.out.println("Charisma> " + character.stats.core.charisma);
			System.out.println("Constitution> " + character.stats.core.constitution);
			System.out.println("Dexterity> " + character.stats.core.dexterity);
			System.out.println("Intelligence> " + character.stats.core.intelligence);
			System.out.println("Strength> " + character.stats.core.strength);
			System.out.println("Wisdom> " + character.stats.core.wisdom);
		}
		
		public void displaySubstats() {
			System.out.println("Animal Handling> " + character.stats.specific.animalHandling);
			System.out.println("Crafting> " + character.stats.specific.crafting);
			System.out.println("Crymancy> " + character.stats.specific.cryomancy);
			System.out.println("Engineering> " + character.stats.specific.engineering);
			System.out.println("First Aid> " + character.stats.specific.firstAid);
			System.out.println("Long Rifles> " + character.stats.specific.longRifles);
		}
		
		public void ShowCharacter() 
		{
			
			System.out.println("Name: " + character.name);
			System.out.println("Level:" + character.level + " EXP: " + character.experience);
			System.out.println("Stats");
			displayStats();
			System.out.println("Sub Stats");
			displaySubstats();
		}

		public void GenerateCharacter() {
			// TODO Auto-generated method stub
			
		}
	}
	
	public class Options
	{
		public boolean explosiveDice;
	}
}
