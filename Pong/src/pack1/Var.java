package pack1;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class Var {
	
	static JFrame jf1; // kann von allen Klasse zugegriffen werden
	static int bildschirmbreite = 800, bildschirmhöhe = 600;
	
	static int x = 20, y = 185;
	static int gegnerX = 755, gegnerY = 185;
	
	static int ballX = 200, ballY = 200;
	
	
	static boolean moveup = false, movedown = false;
	
	static int balldirectionX = 1, balldirectionY = -1; // -1 ist nach oben und 1 ist nach unten
	
	
	static int spielerPunkte = 0, gegnerPunkte = 0;
	
	
	static Font pixelfont;
	
	public Var() {
		try {
			pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")).deriveFont(125f); //125f = ist ein float Wert. Wird um Faktor 125 vergrössert
			GraphicsEnvironment ge =GraphicsEnvironment.getLocalGraphicsEnvironment(); //setzt die Lokale Schirft fest
			
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")));
			
			
		} catch (FontFormatException | IOException e) {														//damit das Programm nicht einstürzt sobald die Datei nicht gefunden wird
			
			e.printStackTrace();
		} 
	}

}
