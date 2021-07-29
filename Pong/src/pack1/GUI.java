package pack1;

import javax.swing.JFrame;

public class GUI {

	public GUI() {
		
		
		Var.jf1 = new JFrame();
		Var.jf1.setSize(Var.bildschirmbreite, Var.bildschirmhöhe);		
		Var.jf1.setTitle("Pong");
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setLayout(null);
		Var.jf1.setResizable(false);
		Var.jf1.setVisible(true);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.addKeyListener(new KeyHandler());
		Var.jf1.requestFocus(); //wollen einen ständigen Focus aud dem Fenster  
		
		Draw labeldraw = new Draw ();
		labeldraw.setBounds(0, 0, Var.bildschirmbreite, Var.bildschirmhöhe);
		labeldraw.setVisible(true);
		Var.jf1.add(labeldraw);
		
		
	}

}
