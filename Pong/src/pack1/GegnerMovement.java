package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class GegnerMovement {
Timer move;

	public GegnerMovement() {
		
	move = new Timer();
	
	move.scheduleAtFixedRate(new TimerTask() {

		@Override
		public void run() {
			
			if(Var.ballX >=Var.bildschirmbreite /2 -10) {
				
			
			
			if (Var.ballY == Var.gegnerY) {
				
			}else if (Var.ballY > Var.gegnerY +75) { // wenn sich der Ball unter der Mitte befindet
					
					if(Var.gegnerY <= Var.bildschirmhöhe -200) {
						Var.gegnerY +=2;
						
					}
				}else if(Var.gegnerY< Var.gegnerY + 75) {
					
					if(Var.gegnerY > 20) {
						Var.gegnerY -=2;
	
					}
					
				}
			
			}
			}
		
		
	}, 0, 6);
	
	}

}
