package rpggame.adventurer;

public enum Armor {
	powerShoes("Power Shoes", "boots", 10);
	
	private String name;
	private String type;
	private int power;
	
	Armor(String name, String type, int power){
		this.name = name;
		this.type = type;
		this.power = power;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public int getPower() {
		return power;
	}
	
}
