import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
	}
	
	//Method for rolling an amount of dice of a certain size
	public static int rollDice(int size, int num)
	{
		int sum = 0;
		int roll = 0;
		for (int x = 0; x < num; x++)
		{
			roll = (int) (Math.random()*size + 1);
			sum += roll;
		}
		return sum;
	}
	//Walks the user through the making of their character. Beginning of the game.
	public Player createCharacter()
	{
		String charName = chooseName();
		String chooseRace = chooseRace();
		String chooseClass = chooseClass();
	}
	public static String chooseName()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Choose a name for your character. Must be between 3 and 16 characters");
		String s = in.nextLine().trim();
		
		if (s.length() < 3 || s.length() > 16)
		{
			System.out.println("That name does not fit the length requirements");
			return chooseName();	//haHAA 'Member recursion? I 'member
		}
		return s;
	}
	public static String chooseRace()
	{	
		String[] a = new String[] {"Dwarf", "Elf", "Halfling", "Human", "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Tiefling"};
		return question("Choose a race for your character by typing one of the names:\n"
				+ "Dwarf\nElf\nHalfling\nHuman\nDragonborn\nGnome\nHalf-Elf\nHalf-Orc\nTiefling", a);
	}
	public static String chooseClass()
	{
		String[] a = new String[] {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorceror", "Warlock", "Wizard"};
		
		return question("Choose a class for your character by typing one of the classes:\n"
				+ "Barbarian\nBard\nCleric\nDruid\nFighter\nMonk\nPaladin\nRanger\nRogue\nSorceror\nWarlock\nWizard", a);
	}
	//Class for prompting the users with questions. Has an array of acceptable answers
	public static String question(String q, String[] answers)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(q);
		String s = in.nextLine();
		for (int x = 0; x < answers.length; x++)
		{
			if (s.equals(answers[x]))
			{
				return s;
			}
		}
		System.out.println("Try typing one of the available options");
		return question(q, answers);
	}
}
