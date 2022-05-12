package rpggame.adventure.monster;

public class Monster {

	String name; 
	double health;
	double damage;
	
	public Monster(String name, double maxHealth, double minHealth, double DamageMult) {
		this.name = name;
		this.health = (Math.random() * maxHealth) + minHealth;
	}
	
}
