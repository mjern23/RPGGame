package rpggame.adventurer;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;

import rpggame.Main;
import rpggame.adventure.paths.BeginAdventure;
import rpggame.classes.Classes;

public class Adventurer {

	public static Main m = new Main();
	private static String name = "";
	private File file = new File("");
	private int i = 1;
	// private Class c = new Class();

	public void createAdventurer(String n) {
		name = n;

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		file = new File(System.getProperty("user.dir") + "_" + n + ".json");
		try {
			if (this.file.createNewFile()) {
				Classes c = pickClass();
				String path = this.file.getAbsolutePath();
				System.out.println("We created a new file for you at " + path);
				Map<String, Object> map = new HashMap<>();
				map.put("Name", name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
				map.put("Health", c.getHealth());
				map.put("Selection", c.name());
				map.put("Level", i);
				map.put("Milestone", 1);
				map.put("Armor", new String[] { "Helmet: ", "Chest: ", "Boots: " });
				map.put("Path", new int[] {});
				try {
					Writer writer = Files
							.newBufferedWriter(Paths.get(System.getProperty("user.dir") + "_" + n + ".json"));
					gson.toJson(map, writer);
					writer.close();
					BeginAdventure.introduceUser();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {

			}
		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static AdventurerObject user() {
		try {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			Reader reader2;
			reader2 = Files.newBufferedReader(Paths.get(System.getProperty("user.dir") + "_" + name + ".json"));
			AdventurerObject user = gson.fromJson(reader2, AdventurerObject.class);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Classes pickClass() {
		System.out.printf(
				"What class would you like to be?%n1) Figter (50 HP)%n2) Wizard (35 HP)%n3) Rogue (50 HP)%n4) Barbarian (75HP)%n>> ");
		int i = m.scan.nextInt();
		String choice = null;
		switch (i) {
		case 1:
			choice = "Fighter";
			break;
		case 2:
			choice = "Wizard";
			break;
		case 3:
			choice = "Rogue";
			break;
		case 4:
			choice = "Barbarian";
			break;
		default:
			System.out.println("Invalid class choice, please select again.");
			pickClass();
			break;
		}

		Classes cla = Enum.valueOf(Classes.class, choice);
		return cla;
	}

}
