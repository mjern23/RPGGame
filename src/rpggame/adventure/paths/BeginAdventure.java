package rpggame.adventure.paths;

import rpggame.Main;
import rpggame.MethodHelp;
import rpggame.adventure.paths.pathone.PathOne;
import rpggame.adventure.paths.paththree.PathThree;
import rpggame.adventure.paths.pathtwo.PathTwo;
import rpggame.adventurer.Adventurer;

public class BeginAdventure {

	public static Main m = new Main();

	public static void introduceUser() {
		System.out.printf("Professor Nick> Hello, %s. It's nice to meet you. My name is Professor Nick.%nProfessor Nick> I will appear here every"
				+ " now and then to give you some tips along the way.%nProfessor Nick> Good luck on your journey, Adventurer.%n",
				Adventurer.user().getName());
		MethodHelp methodHelp = new MethodHelp();
		methodHelp.cusWait(3);
		pickStartPath();
	}

	public static void pickStartPath() {
		System.out.printf("???> Hello, Adventurer. You have 3 choices here. Make sure to make your decision wisely.%n1) %n2) %n3)%n>> ");
		MethodHelp methodHelp = new MethodHelp();
		int choice = m.scan.nextInt();
		methodHelp.cusWait(3);
		switch (choice) {
		case 1:
			PathOne.startPath();
			break;
		case 2:
			PathTwo.startPath();
			break;
		case 3:
			PathThree.startPath();
			break;
		default:
			System.out.printf("???> I don't even know how or why you chose that. You cannot do that. Try again.");
			pickStartPath();
		}
	}

}
