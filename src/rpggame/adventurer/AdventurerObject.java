package rpggame.adventurer;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AdventurerObject {

	private String Name;
	private int[] Path;
	private int Health;
	private String[] Armor;
	private String Selection;
	private int Level;
	private int Milestone;

	public AdventurerObject(int[] Path, int Health, String Selection, String[] Armor, int Level, String Name, int Milestone) {
		this.Name = Name;
		this.Path = Path;
		this.Health = Health;
		this.Armor = Armor;
		this.Selection = Selection;
		this.Level = Level;
		this.Milestone = Milestone;
	}

	public String getName() {
		return this.Name;
	}

	public int[] getPath() {
		return this.Path;
	}

	public int getHealth() {
		return this.Health;
	}

	public String[] getArmor() {
		return this.Armor;
	}

	public String getUserClass() {
		return this.Selection;
	}

	public int getLevel() {
		return Level;
	}

	public int getMS() {
		return Milestone;
	}
	
	public void addPathChoice(int assignment) {
		int[] newArray = { assignment };
		int aLen = Path.length;
		int bLen = newArray.length;
		int[] result = new int[aLen + bLen];

		System.arraycopy(Path, 0, result, 0, aLen);
		System.arraycopy(newArray, 0, result, aLen, bLen);
		
		this.Path = result;
		Reader reader;
		try {
			reader = Files.newBufferedReader(
					Paths.get(System.getProperty("user.dir") + "_" + getName() + ".json"));
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			@SuppressWarnings("unchecked")
			Map<String, Object> map = gson.fromJson(reader, Map.class);
			map.put("Path", getPath());
			try {
				Writer writer = Files.newBufferedWriter(Paths
						.get(System.getProperty("user.dir") + "_" + getName() + ".json"));
				gson.toJson(map, writer);
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			reader.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
