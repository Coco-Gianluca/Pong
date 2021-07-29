package pack1;

import java.awt.*;

import javax.swing.JLabel;

public class Draw extends JLabel{
	
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d =(Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //Sorgt dafür das es keine harten Kanten hat. 1 pixel wird mit einem halben Pixel aufgeführt (nur Randpixel)
		 
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Var.bildschirmbreite, Var.bildschirmhöhe);
		
		g.setColor(Color.WHITE);
		
		
		for(int i= 0; i<=30; i++) {
			
			g.fillRect(Var.bildschirmbreite/2 -5, i*20, 10,10); // durch 2 weil wir es in der Mitte haben wollen
																  // i*20 = nach allen 20 Pixel wird ein neues Rechteck gezeichnet		
																  // 10,10 = Pixel ist 10 hoch und 10 breit
		
		}
		
		g.fillRect(Var.x, Var.y, 25, 150);
		
		g.fillRect(Var.gegnerX, Var.gegnerY, 25, 150);
		
		g.setFont(Var.pixelfont);
		
		g.drawString("" + Var.spielerPunkte, Var.bildschirmbreite/2 -95, 75);
		
		g.drawString("" + Var.gegnerPunkte, Var.bildschirmbreite/2 +50, 75);
		
		g.fillRect(Var.ballX, Var.ballY, 20, 20); 
		
		repaint(); //ist ein ständiger refresh
		 
		 
	}

}
