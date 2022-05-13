package rpggame.adventure.monster;

public class Monster {

	private String name; 
	private double health;
	private double attack;
	private double maxDamage, minDamage;
	
	public Monster(String name, double maxHealth, double minHealth, double maxDamage, double minDamage) {
		this.name = name;
		this.health = (Math.random() * maxHealth) + minHealth;
		this.maxDamage = maxDamage;
		this.minDamage = minDamage;
//		Array[] monsterInfo = new ArrayList();
//		monsterInfo.add(this.name);
//		monsterInfo.add(this.health)
//		monsterInfo.add(this.attack);
	}
	
	public double getHealth() {
		return this.health;
	}
	
	public double attack() {
		this.attack = (Math.random() * maxDamage) + minDamage;
		
		return attack;
	}
	
	public String getName() {
		return this.name;
	}
	
}
