package cf.brumock.firstproject.game.items;

import java.util.Arrays;
import java.util.List;

public class Items 
{	
	public static Item stone = new Item("Stone", 0d, 10f);
	public static Item stick = new Item("Stick", 0d, 10f);
	public static Item rust = new Item("Rust", 0d, 10f);
	public static Item ore_iron = new Item("Iron Ore", 0d, 10f);
	public static Item dust_iron = new Item("Iron Dust", 0d, 10f);
	public static Item ingot_iron = new Item("Iron Ingot", 0d, 10f);
	public static Item ore_copper = new Item("Copper Ore", 0d, 10f);
	public static Item ingot_copper = new Item("Copper Ingot", 0d, 10f);
	public static Item hemp = new Item("Hemp", 0d, 10f);
	public static Item fiber_hemp = new Item("Hemp Fiber", 0d, 10f);
	public static Item rope_hemp = new Item("Hempin Rope", 0d, 10f);
	public static Item log = new Item("Log", 0d, 10f);
	public static Item plank = new Item("Plank", 0d, 10f);
	public static Item shaft = new Item("Shaft", 0d, 10f);
	public static Item clay = new Item("Clay", 0d, 10f);
	public static Item cast_tool = new Item("Tool Cast", 0d, 10f);
	public static Item cast_weapon = new Item("Weapon Cast", 0d, 10f);
	public static Item hammer = new Item("Hammer", 0d, 10f);
	public static Item saw = new Item("Saw", 0d, 10f);
	public static Item bow_string = new Item("Bow String", 0d, 10f);
	public static Item bow = new Item("Bow", 0d, 10f);
	public static Item two_man_mill = new Item("Two Man Mill", 0d, 10f);
	public static Item bow_hand = new Item("Hand Bow", 0d, 10f);
	public static Item bandage =  new Item("Bandage", 0d, 10f);
	public static Item tunic = new Item("Tunic", 0d, 10f);
	public static Item flint = new Item("Flint", 0d, 10f);
	public static Item arrow_head_flint = new Item("Flint Arrow Head", 0d, 10f);
	public static Item shaft_arrow = new Item("Arrow Shaft", 0d, 10f);
	public static Item arrow_head_iron = new Item("Iron Arrow Head", 0d, 10f);
	public static Item arrow_flint = new Item("Aroow (Flint)", 0d, 10f);
	public static Item arrow_iron = new Item("Arrow (Iron)", 0d, 10f);
    
	private static Item[] items = 
	{
			stone,
			stick,
			rust,
			ore_iron,
			dust_iron,
			ingot_iron,
			ore_copper,
			ingot_copper,
			hemp,
			fiber_hemp,
			rope_hemp,
			log,
			plank,
			shaft,
			clay,
			cast_tool,
			cast_weapon,
			hammer,
			saw,
			bow_string,
			bow,
			two_man_mill,
			bow_hand,
			bandage,
			tunic,
			flint,
			arrow_head_flint,
			shaft_arrow,
			arrow_head_iron,
			arrow_flint,
			arrow_iron,
	};
	
	public static List<Item> ITEMS = Arrays.asList(items);
}
