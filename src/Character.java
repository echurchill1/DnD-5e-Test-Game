import java.util.ArrayList;

//Superclass for all characters in the game, including players, enemies, and possible friendly NPCs
public class Character {

	private String name;
	private int level;
	private String race;			//For enemies, you can put Goblin, Demon, Dragon, etc.
	
	private String alignEthical;	//Lawful, Neutral, or Chaotic
	private String alignMoral;		//Good, Neutral, or Evil
	
	private int armorClass;
	private int maxHealth;
	private int currentHealth;
	
	private int initiativeMod;
	private int speed;				//Most Medium-Sized creatures have a base speed of 6
	
	//Base Stats
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	//Strength Skills
	private int athletics;
	//Dexterity Skills
	private int acrobatics;
	private int sleightOfHand;
	private int stealth;
	//Intelligence Skills
	private int arcana;
	private int history;
	private int investigation;
	private int nature;
	private int religion;
	//Wisdom Skills
	private int animalHandling;
	private int insight;
	private int medicine;
	private int perception;
	private int survival;
	//Charisma Skills
	private int deception;
	private int intimidation;
	private int performance;
	private int persuasion;
	
	private String[] languagesKnown;
	
	private ArrayList<Item> inventory;

	//Constructor
	public Character(String name, int level, String race, String alignEthical, String alignMoral,int armorClass, int maxHealth, int iMod, int speed, 
			int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, String[] langKnown)
	{
		this.name = name;
		this.level = level;
		this.race = race;
		this.alignEthical = alignEthical;
		this.alignMoral = alignMoral;
		this.armorClass = armorClass;
		this.maxHealth = maxHealth;
		this.currentHealth = maxHealth;
		this.initiativeMod = iMod;
		this.speed = speed;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.languagesKnown = langKnown;
		this.inventory = new ArrayList<Item>();
		
		//Note: Enemies tend to have numbers for skills that do not directly come from the formula (Relevant Stat Mod + Proficiency). In this case, we just use the setters to add
		//		necessary additions. Thus, we don't need to use proficiencies for enemies. Proficiencies will be included in the Player class though.
		
		//Skills
		this.athletics = getModifier(this.strength);
		this.acrobatics = getModifier(this.dexterity);
		this.sleightOfHand = getModifier(this.dexterity);
		this.stealth = getModifier(this.dexterity);
		this.arcana = getModifier(this.intelligence);
		this.history = getModifier(this.intelligence);
		this.investigation = getModifier(this.intelligence);
		this.nature = getModifier(this.intelligence);
		this.religion = getModifier(this.intelligence);
		this.animalHandling = getModifier(this.wisdom);
		this.insight = getModifier(this.wisdom);
		this.medicine = getModifier(this.wisdom);
		this.perception = getModifier(this.wisdom);
		this.survival = getModifier(this.wisdom);
		this.deception = getModifier(this.charisma);
		this.intimidation = getModifier(this.charisma);
		this.performance = getModifier(this.charisma);
		this.persuasion = getModifier(this.charisma);
	}
	
	//Thousands of Getters and Setters
	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getRace() {
		return race;
	}

	public String getAlignEthical() {
		return alignEthical;
	}

	public String getAlignMoral() {
		return alignMoral;
	}

	public int getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getInitiativeMod() {
		return initiativeMod;
	}

	public void setInitiativeMod(int initiativeMod) {
		this.initiativeMod = initiativeMod;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getAthletics() {
		return athletics;
	}

	public void setAthletics(int athletics) {
		this.athletics = athletics;
	}

	public int getAcrobatics() {
		return acrobatics;
	}

	public void setAcrobatics(int acrobatics) {
		this.acrobatics = acrobatics;
	}

	public int getSleightOfHand() {
		return sleightOfHand;
	}

	public void setSleightOfHand(int sleightOfHand) {
		this.sleightOfHand = sleightOfHand;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getArcana() {
		return arcana;
	}

	public void setArcana(int arcana) {
		this.arcana = arcana;
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public int getInvestigation() {
		return investigation;
	}

	public void setInvestigation(int investigation) {
		this.investigation = investigation;
	}

	public int getNature() {
		return nature;
	}

	public void setNature(int nature) {
		this.nature = nature;
	}

	public int getReligion() {
		return religion;
	}

	public void setReligion(int religion) {
		this.religion = religion;
	}

	public int getAnimalHandling() {
		return animalHandling;
	}

	public void setAnimalHandling(int animalHandling) {
		this.animalHandling = animalHandling;
	}

	public int getInsight() {
		return insight;
	}

	public void setInsight(int insight) {
		this.insight = insight;
	}

	public int getMedicine() {
		return medicine;
	}

	public void setMedicine(int medicine) {
		this.medicine = medicine;
	}

	public int getPerception() {
		return perception;
	}

	public void setPerception(int perception) {
		this.perception = perception;
	}

	public int getSurvival() {
		return survival;
	}

	public void setSurvival(int survival) {
		this.survival = survival;
	}

	public int getDeception() {
		return deception;
	}

	public void setDeception(int deception) {
		this.deception = deception;
	}

	public int getIntimidation() {
		return intimidation;
	}

	public void setIntimidation(int intimidation) {
		this.intimidation = intimidation;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	public int getPersuasion() {
		return persuasion;
	}

	public void setPersuasion(int persuasion) {
		this.persuasion = persuasion;
	}

	public String[] getLanguagesKnown() {
		return languagesKnown;
	}

	public void setLanguagesKnown(String[] languagesKnown) {
		this.languagesKnown = languagesKnown;
	}
	
	//Method to calculate a stat modifier, so I won't need to calculate on the spot every time. Note: Calling this method will have to be in reference to a specific character
			public static int getModifier(int num)
			{
				if (num > 9)
				{
					int x = num - 10;
					return x/2;
				}
				else 
				{
					int x = 11 - num;
					return -(x/2);
				}
			}
}
