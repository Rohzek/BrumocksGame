package cf.brumock.firstproject.game.dice;

public class Dice 
{
	public int size,
	    	   count,
	    	   multiplication,
	    	   division,
	    	   addition,
	    	   subtraction;
	
	// Empty constructor so that creating a Dice object without parameters is possible
	public Dice() {}
	
	// Constructor that sets numbers
	public Dice(int si, int c, int m, int d, int a, int su) 
	{
		this.size = si;
		this.count = c;
		this.multiplication = m;
		this.division = d;
		this.addition = a;
		this.subtraction = su;
	}
	
	@Override
	public String toString() 
	{
		return String.format("%sd%s*%s/%s+%s-%s", count, size, multiplication, division, addition, subtraction);
	}
}
