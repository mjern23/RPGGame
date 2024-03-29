/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rpggame.adventure.paths;

import java.awt.event.KeyEvent;
import rpggame.adventurer.Adventurer2;


public class BeginAdventure2 extends javax.swing.JFrame {
	
	public BeginAdventure2() {
		initComponents();
	}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Your Character");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpggame/wizard_guy.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Hello there, Adventurer. My name is Professor Hearth.");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("(Click to continue)");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jLabel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel4KeyPressed(evt);
            }
        });

        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 63, Short.MAX_VALUE))
        );

        name.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
              if (evt.getKeyCode()==KeyEvent.VK_ENTER){
                switch (count) {
                    case 0:
                        name.setText("Professor Hearth");
                        jLabel3.setText("I will be here to guide you every once and awhile. I will only show up rarely.");
                        break;
                    case 1:
                        jLabel3.setText("I wish you the best of luck on your adventure, " + Adventurer2.user().getName() + ".");
                        break;
                    case 2:
                        new PickPath().startPick();
                        this.dispose();
                        break;
                    default:
                        break;
                }
            count++;
        }
    }//GEN-LAST:event_formKeyPressed

	private void jLabel4KeyPressed(java.awt.event.KeyEvent evt) {
 
	}

	int count;

	private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {
            switch (count) {
                case 0:
                    name.setText("Professor Hearth");
                    jLabel3.setText("I will be here to guide you every once and awhile. I will only show up rarely.");
                    break;
                case 1:
                    jLabel3.setText("I wish you the best of luck on your adventure, " + Adventurer2.user().getName() + ".");
                    break;
                case 2:
                    new PickPath().startPick();
                    this.dispose();
                    break;
                default:
                    break;
            }
		count++;
	}

	private void formMouseClicked(java.awt.event.MouseEvent evt) {
            switch (count) {
                case 0:
                    name.setText("Professor Hearth");
                    jLabel3.setText("I will be here to guide you every once and awhile. I will only show up rarely.");
                    break;
                case 1:
                    jLabel3.setText("I wish you the best of luck on your adventure, " + Adventurer2.user().getName() + ".");
                    break;
                case 2:
                    new PickPath().startPick();
                    this.dispose();
                    break;
                default:
                    break;
            }
		count++;
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
			java.util.logging.Logger.getLogger(BeginAdventure2.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new BeginAdventure2().setVisible(true);
			}
		});
	}

	public void introduceUser() {
		new BeginAdventure2().setVisible(true);
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
