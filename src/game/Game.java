package game;

import main.Main;

public class Game 
{
	public static character.Character character = new character.Character();
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
	}
	
	public class Options
	{
		public boolean explosiveDice;
	}
}
