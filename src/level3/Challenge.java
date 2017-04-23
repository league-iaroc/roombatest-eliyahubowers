package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	static int speed = 10000;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		System.out.println("start");
		goStraight(1500);

	}

	public void loop() {
	}

	void goStraight(int t) {
		System.out.println("test");
		driveDirect(speed, speed);
		sleep(t);
	}
}
