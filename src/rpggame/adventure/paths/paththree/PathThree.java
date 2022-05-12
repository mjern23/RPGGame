package rpggame.adventure.paths.paththree;

import rpggame.adventurer.Adventurer;

public class PathThree {

	public static void startPath() {
		System.out.println("You picked path 3!");
		Adventurer.user().addPathChoice(3);
	}
	
}
