package items;

import java.util.Arrays;
import java.util.List;

public class Items 
{	
	private static Item[] items = 
	{
			new Item("Stone", 0d, 10f),
			new Item("AnotherItem", 200d, 0.1f)
	};
	
	public static List<Item> ITEMS = Arrays.asList(items);
}
