package cf.brumock.firstproject.main;

import java.util.Random;
import java.util.Scanner;

import cf.brumock.firstproject.game.Game;
import cf.brumock.firstproject.game.dice.DiceRoll;

public class Main 
{
	public static Random random = new Random();
	public static Scanner scanner = new Scanner(System.in);
	public static DiceRoll dice = new DiceRoll();
	
	public static Game game = new Game();
	
	public static void main(String[] args) 
	{
		game.setup.RunSetup();
		game.setup.ShowCharacter();
	}
}
