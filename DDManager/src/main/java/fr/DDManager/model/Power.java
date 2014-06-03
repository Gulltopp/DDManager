package fr.DDManager.model;

public class Power {

	String name;
	String type;
	String associatedStat;
	String areaOfEffect;
	String targets;
	int range;
	String onHit;
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
	public String getAssociatedStat() {
		return associatedStat;
	}
	public void setAssociatedStat(String associatedStat) {
		this.associatedStat = associatedStat;
	}
	public String getAreaOfEffect() {
		return areaOfEffect;
	}
	public void setAreaOfEffect(String areaOfEffect) {
		this.areaOfEffect = areaOfEffect;
	}
	public String getTargets() {
		return targets;
	}
	public void setTargets(String targets) {
		this.targets = targets;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public String getOnHit() {
		return onHit;
	}
	public void setOnHit(String onHit) {
		this.onHit = onHit;
	}
}
