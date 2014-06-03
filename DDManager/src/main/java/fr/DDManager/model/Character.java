package fr.DDManager.model;

public class Character {
	String name;
	String playerName;
	String race;
	String characterClass;
	int level;
	int experience;
	
	int strength;
	int constitution;
	int dexterity;
	int intelligence;
	int wisdom;
	int charisma;
	
	int speed;
	
	int maxHp;
	int bloodiedValue;
	int surgesPerDay;
	int surgeValue;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Character() {
		setName("");
	}
	public Character(int id, String name) {
		setName(name);
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getCharacterClass() {
		return characterClass;
	}
	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getConstitution() {
		return constitution;
	}
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
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
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getBloodiedValue() {
		return bloodiedValue;
	}
	public void setBloodiedValue(int bloodiedValue) {
		this.bloodiedValue = bloodiedValue;
	}
	public int getSurgesPerDay() {
		return surgesPerDay;
	}
	public void setSurgesPerDay(int surgesPerDay) {
		this.surgesPerDay = surgesPerDay;
	}
	public int getSurgeValue() {
		return surgeValue;
	}
	public void setSurgeValue(int surgeValue) {
		this.surgeValue = surgeValue;
	}

}
