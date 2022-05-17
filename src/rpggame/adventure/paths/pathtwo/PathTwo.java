package rpggame.adventure.paths.pathtwo;

import rpggame.adventurer.Adventurer;

public class PathTwo {

	public static void startPath() {
		System.out.println("You picked path 2!");
		Adventurer.user().addPathChoice(2);
	}

}
