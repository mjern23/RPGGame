package rpggame.classes;

public enum Trade {
	Fighter(50), 
	Wizard(35), 
	Rogue(50), 
	Barbarian(75);

	private int health = 0;

	Trade(int h) {
		health = h;
	}

	public int getClassHealth() {
		return health;
	}

}
