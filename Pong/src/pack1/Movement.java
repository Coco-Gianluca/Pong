package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {

	Timer move;
	
	
	public Movement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				if(Var.moveup == true) { // oberen Rand kollidiert
					
					if(Var.y >=20) {
						Var.y -=2; //bei jedem durchgang bewegen wir uns 2 pixel
					}
					
				}else if (Var.movedown == true) { //unteren rand kolidiert
					
					if (Var.y<= Var.bildschirmhöhe - 200) {
						Var.y += 2; //bei jedem durchgang bewegen wir uns 2 pixel
					}
				}
				
			}
			
		}, 0, 6); // die 6 bestimmt wie viele ms es braucht 
		
	}

}
