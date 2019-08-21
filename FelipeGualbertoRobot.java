package gualbertorobo;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * FelipeGualbertoRobot - a robot by (Gualberto)
 */
public class FelipeGualbertoRobot extends Robot
{
	static boolean flagReverse = true;
	int velocityBearing = 100;
	/**
	 * run: FelipeGualbertoRobot's default behavior
	 */
	public void run() {
	
		while(true) {
		
			turnGunRight(velocityBearing);
			turnRight(10);
			back(35);	
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		turnGunRight(0);
		fire(2);
		stop();
		scan();
		resume();
	}

	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		turnRight(30);
		if(flagReverse){
		ahead(300);
		flagReverse = !flagReverse;
		}else{
		flagReverse = !flagReverse;
		back(300);
		}

	}
	
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		if(flagReverse){
		ahead(300);
		flagReverse = !flagReverse;
		}else{
		flagReverse = !flagReverse;
		back(300);
		}
	}	
}
