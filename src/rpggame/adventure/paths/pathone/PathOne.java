package rpggame.adventure.paths.pathone;

import rpggame.adventure.monster.Monster;
import rpggame.adventurer.Adventurer;
import rpggame.classes.Trade;

public class PathOne {

	public static void startPath() {
		System.out.println("You picked path 1!");
		Adventurer.user().addPathChoice(1);

		Monster m = new Monster("Jake", 100, 50, 40, 15);
		int damage = m.attack();
		Adventurer.user().takeDamage(damage);
		System.out.printf("%s did %s damage to you. ", m.getName(), damage);
		
		
		Trade t = Adventurer.user().getUserClass();
		System.out.printf("Your health is currently: %s / %s", Adventurer.user().getHealth(), t.getClassHealth());
	}

}
