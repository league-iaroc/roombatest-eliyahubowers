package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(10000, 10000);
		sleep(1500);
		driveDirect(0, 500);
		sleep(550);
		driveDirect(10000, 10000);
		sleep(2500);
		driveDirect(500, 0);
		sleep(550);
		driveDirect(1000000, 1000000);
	}

	public void loop() {

	}
}
