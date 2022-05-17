package rpggame.adventure.monster;

import java.text.DecimalFormat;

public class Monster {

	private String name;
	private double health;
	private double attack;
	private double maxDamage, minDamage;

	public Monster(String name, double maxHealth, double minHealth, double maxDamage, double minDamage) {
		this.name = name;
		this.health = (Math.random() * (maxHealth - minHealth)) + minHealth;
		this.maxDamage = maxDamage;
		this.minDamage = minDamage;
//		Array[] monsterInfo = new ArrayList();
//		monsterInfo.add(this.name);
//		monsterInfo.add(this.health)
//		monsterInfo.add(this.attack);
	}

	public String getHealth() {
		DecimalFormat format = new DecimalFormat("0.0");
		return format.format(health);
	}

	public int attack() {

		this.attack = (Math.random() * maxDamage) + minDamage;

		return (int) attack;
	}

	public String getName() {
		return this.name;
	}

}
