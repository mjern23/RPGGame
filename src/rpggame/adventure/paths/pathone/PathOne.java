package rpggame.adventure.paths.pathone;

import rpggame.adventurer.Adventurer;

public class PathOne {

	public static void startPath() {
		System.out.println("You picked path 1!");
		Adventurer.user().addPathChoice(1);
	}
	
}
