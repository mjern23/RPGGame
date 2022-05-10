package rpggame;

import java.util.Scanner;

import rpggame.adventurer.Adventurer;
import rpggame.adventurer.AdventurerObject;

public class Main {

	public Scanner scan = new Scanner(System.in);
	private static Main m = new Main();
	private static Adventurer adv = new Adventurer();
	public AdventurerObject advObj;
	private String name; 
	public static void main(String args[]) {
		System.out.printf("Hello adventurer, what is your name?%n>> ");
		m.name = m.scan.nextLine();

		adv.createAdventurer(m.name);

	}

}
