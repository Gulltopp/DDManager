package fr.DDManager.model;

public class Item {

	String name;
	String type;
	int enchantement;
	String oncrit;
	java.util.HashMap<String, Power> powers;
	String Property;
	String attackEffect;
	String defenseEffect;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getEnchantement() {
		return enchantement;
	}
	public void setEnchantement(int enchantement) {
		this.enchantement = enchantement;
	}
	public String getOncrit() {
		return oncrit;
	}
	public void setOncrit(String oncrit) {
		this.oncrit = oncrit;
	}
	public java.util.HashMap<String, Power> getPowers() {
		return powers;
	}
	public void setPowers(java.util.HashMap<String, Power> powers) {
		this.powers = powers;
	}
	public String getProperty() {
		return Property;
	}
	public void setProperty(String property) {
		Property = property;
	}
	public String getAttackEffect() {
		return attackEffect;
	}
	public void setAttackEffect(String attackEffect) {
		this.attackEffect = attackEffect;
	}
	public String getDefenseEffect() {
		return defenseEffect;
	}
	public void setDefenseEffect(String defenseEffect) {
		this.defenseEffect = defenseEffect;
	}
	
	
}
