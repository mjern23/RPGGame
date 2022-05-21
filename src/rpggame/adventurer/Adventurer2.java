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
import com.google.gson.JsonSyntaxException;

import rpggame.Main;
import rpggame.adventure.paths.BeginAdventure2;
import rpggame.adventure.paths.farmerpath.FarmerStart;
import rpggame.classes.Trade;

public class Adventurer2 extends javax.swing.JFrame {

	public Adventurer2() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		ClassChoices = new javax.swing.JComboBox<>();
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Setup Your Character");
		
		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpggame/Wizard_Image.png")));
		jLabel1.setText("jLabel1");

		ClassChoices.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Fighter", "Wizard", "Rogue", "Barbarian" }));
		ClassChoices.setToolTipText("");

		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Select Class:");

		jButton1.setText("Continue");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(35, 35, 35)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(ClassChoices, javax.swing.GroupLayout.PREFERRED_SIZE,
										129, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(196, 196, 196).addComponent(jButton1)))
				.addGap(0, 332, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addGap(102, 102, 102)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(ClassChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButton1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}

	private Boolean cont = false;

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		createAdventurer(name);
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Adventurer2.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

			}
		});
	}

	public static Main m = new Main();
	private static String name = "";
	private File file = new File("");
	private int i = 1;

	public void giveName(String n) {
		name = n;
		file = new File(System.getProperty("user.dir") + "_" + n + ".json");
		if (!file.exists()) {
			new Adventurer2().setVisible(true);
		} else if (file.exists()) {
			// Start from path
			int[] path = user().getPath();
			switch (path[0]) {
			case 1:
				System.out.println("1");
				new FarmerStart().contPath();
				break;
			case 2:
				System.out.println("2");
				// HermitStart.contPath();
				break;
			case 3:
				System.out.println("3");
				// WarriorStart.contPath();
				break;
			default:
				System.out.println("Something went really wrong here.");
				break;
			}
			return;
		}
		for (String classstr : classes) {
			ClassChoices.addItem(classstr);
		}
	}

	public void createAdventurer(String n) {
		name = n;

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		file = new File(System.getProperty("user.dir") + "_" + n + ".json");
		try {
			if (!file.exists()) {
				Trade c = pickClass();
//				String path = this.file.getAbsolutePath();
				Map<String, Object> map = new HashMap<>();
				map.put("Name", name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
				map.put("Health", c.getClassHealth());
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
					new BeginAdventure2().introduceUser();
					this.dispose();
				} catch (IOException e) {
				}
			}
		} catch (JsonIOException e) {
		}

	}

	public static AdventurerObject user() {
		try {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			Reader reader2;
			reader2 = Files.newBufferedReader(Paths.get(System.getProperty("user.dir") + "_" + name + ".json"));
			AdventurerObject user = gson.fromJson(reader2, AdventurerObject.class);
			return user;
		} catch (JsonIOException | JsonSyntaxException | IOException e) {
		}
		return null;
	}

	String[] classes = { "Fighter", "Wizard", "Rogue", "Barbarian" };

	public Trade pickClass() {
		String choice = ClassChoices.getSelectedItem().toString();
//		System.out.printf(
//				"What class would you like to be?%n1) Figter (50 HP)%n2) Wizard (35 HP)%n3) Rogue (50 HP)%n4) Barbarian (75HP)%n>> ");
//		int i = m.scan.nextInt();
//		switch (i) {
//		case 1:
//			choice = "Fighter";
//			break;
//		case 2:
//			choice = "Wizard";
//			break;
//		case 3:
//			choice = "Rogue";
//			break;
//		case 4:
//			choice = "Barbarian";
//			break;
//		default:
//			System.out.println("Invalid class choice, please select again.");
//			pickClass();
//			break;
//		}
		Trade cla = Enum.valueOf(Trade.class, choice);
		return cla;
	}

	private javax.swing.JComboBox<String> ClassChoices;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;

}