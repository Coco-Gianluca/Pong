package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class BallKollision {
	
Timer kollision;

	public BallKollision() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(Var.ballY +50 >= Var.bildschirmhöhe) {
					Var.balldirectionY = -1;
										
				}
				
				if(Var.ballY <= 0) {
					Var.balldirectionY = 1;
				}
				
				if(Var.ballX +20 >= Var.bildschirmbreite) {
					Var.ballX = Var.bildschirmbreite /2 -10;
					Var.ballY = Var.bildschirmhöhe /2 -10;
					
					Var.balldirectionX = -1;
					Var.spielerPunkte  += 1;
				}
				
				if (Var.ballX <=0 ) {
					Var.ballX = Var.bildschirmbreite /2 -10;
					Var.ballY = Var.bildschirmhöhe /2 -10;
					
					
					Var.balldirectionX = 1;
					Var.gegnerPunkte  += 1;
				}
				
				if (Var.ballX <Var.x +25 && Var.ballX > Var.x &&  Var.ballY -20 < Var.y + 150 && Var.ballY > Var.y) { //ist für die Hitboxen
					Var.balldirectionX = 1;
				}
				
				if (Var.ballX <Var.gegnerX && Var.ballX > Var.gegnerX -20 &&  Var.ballY -20 < Var.gegnerY + 150 && Var.ballY > Var.gegnerY) { //Weil es nicht mehr links ist, brauchen wir die + 25 nicht mehr
					Var.balldirectionX = -1;
				}
				
			}
		}, 0, 4);
		
	}

}
