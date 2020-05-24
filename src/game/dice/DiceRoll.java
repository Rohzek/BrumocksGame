package game.dice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DiceRoll
{
	public DiceRoll() {}
	
	public List<Dice> Roll(String input) 
	{
		Random random = new Random();
		String[] inputs = input.split("\\s+");
		List<Dice> dice = new ArrayList<Dice>();
		
		for (String in : inputs) 
		{
			dice.add(Convert(in));
		}
		
		for(Dice die : dice) 
		{
			for (int i = 0; i < die.count; i++) 
			{
				int number = 1 + random.nextInt(die.size);
				float total = number;
				
				if(die.multiplication > 1) 
				{
					total = number * die.multiplication;
				}
				
				if(die.division > 1) 
				{
					total = total / die.division;
				}
				
				if(die.addition > 0) 
				{
					total = total + die.addition;
				}
				
				if(die.subtraction > 0) 
				{
					total = total - die.subtraction;
				}
				
				System.out.println("Rolled a d" + die.size);
				System.out.println("Rolled: " + number);
				System.out.println("Totalled: " + (total % 1 == 0 ? "" + (int) total : "" + total));
			}
		}
		
		return dice;
	}
	
	public List<Dice> RollMegumin(String input) 
	{
		Random random = new Random();
		String[] inputs = input.split("\\s+");
		List<Dice> dice = new ArrayList<Dice>();
		
		for (String in : inputs) 
		{
			dice.add(Convert(in));
		}
		
		for(Dice die : dice) 
		{
			for (int i = 0; i < die.count; i++) 
			{
				int number = 1 + random.nextInt(die.size);
				float total = 0;
				
				if(number == die.size) 
				{
					while(number == die.size) 
					{
						total += die.size;
						number = 1 + random.nextInt(die.size);
					}
					
					total += number;
				}
				else
				{
					total = number;
				}
				
				
				if(die.multiplication > 1) 
				{
					total = number * die.multiplication;
				}
				
				if(die.division > 1) 
				{
					total = total / die.division;
				}
				
				if(die.addition > 0) 
				{
					total = total + die.addition;
				}
				
				if(die.subtraction > 0) 
				{
					total = total - die.subtraction;
				}
				
				System.out.println("Rolled a d" + die.size);
				System.out.println("Rolled: " + number);
				System.out.println("Totalled: " + (total % 1 == 0 ? "" + (int) total : "" + total));
			}
		}
		
		return dice;
	}
	
	
	
	private Dice Convert(String input) 
	{
		Matcher match;
		Pattern patternCount = Pattern.compile("\\d+[dD]"),
			   patternSize = Pattern.compile("[dD]\\d+"), 
			   patternAddition = Pattern.compile("\\+\\d+"), 
			   patternSubtraction = Pattern.compile("\\-\\d+"), 
			   patternMultiplication = Pattern.compile("\\*\\d+"), 
			   patternDivision = Pattern.compile("\\/\\d+");
		int size = 1,
		 	count = 1,
		 	multiplication = 0,
		 	division = 1,
		 	addition = 0,
		 	subtraction = 0;
		
		match = patternCount.matcher(input);
		while(match.find()) 
		{
			String result = match.group(0);
			result = result.toLowerCase().replaceAll("([a-z])", "");
			count = Integer.parseInt(result);
		}
		
		match = patternSize.matcher(input);
		while(match.find()) 
		{
			String result = match.group(0);
			result = result.toLowerCase().replaceAll("([a-z])", "");
			size = Integer.parseInt(result);
		}
		
		match = patternAddition.matcher(input);
		while(match.find()) 
		{
			String result = match.group(0);
			result = result.replace("+", "");
			addition = Integer.parseInt(result);
		}
		
		match = patternSubtraction.matcher(input);
		while(match.find()) 
		{
			String result = match.group(0);
			result = result.replace("-", "");
			subtraction = Integer.parseInt(result);
		}
		
		match = patternMultiplication.matcher(input);
		while(match.find()) 
		{
			String result = match.group(0);
			result = result.replace("*", "");
			multiplication = Integer.parseInt(result);
		}
		
		match = patternDivision.matcher(input);
		while(match.find()) 
		{
			String result = match.group(0);
			result = result.replace("/", "");
			division = Integer.parseInt(result);
		}
		
		return new Dice(size, count, multiplication, division, addition, subtraction);
	}
}
