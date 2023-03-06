package n.t;
import robocode.*;
import java.awt.Color;

public class Terminator extends Robot
{

	public void run() {

		setColors(Color.black,Color.white,Color.red);

		while(true) {
			ahead(150);
			turnGunRight(360);
			back(95);
			turnGunRight(360);
		}
	}


	public void onScannedRobot(ScannedRobotEvent e) 
	{
		fire(3);
		turnGunLeft(0.1);
		turnGunRight(0.1);
		int num = 0;
		while(num < 4)
		{
			fire(1.5);
			num++;
		}
	}

	public void onHitByBullet(HitByBulletEvent e) 
	{
		back(50);
		turnRight(90);
		ahead(100);
	}
		
	
	public void onHitWall(HitWallEvent e) 
	{
		back(250);
	}

	
	
	public void onHitRobot (HitRobotEvent e) 
	{
		back(20);
		fire(3);
		ahead(80);
	}
	
	public void onWin(WinEvent e) 
	{
        turnRight(36000);
    }
}
