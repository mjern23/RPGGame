package rpggame.adventurer;

public class AdventurerObject {

	private String Name;
	private String[] Path;
	private int Health;
	private String[] Armor;
	private String Selection;

	public AdventurerObject(String[] Path, int Health, String[] Armor, String Name, String Selection) {
		this.Name = Name;
		this.Path = Path;
		this.Health = Health;
		this.Armor = Armor;
		this.Selection = Selection;
	}

	public String getName() {
		return this.Name;
	}

	public String[] getPath() {
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

}
