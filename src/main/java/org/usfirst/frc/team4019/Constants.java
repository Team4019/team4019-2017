package org.usfirst.frc.team4019;

public abstract class Constants {
	// Peripherals attached to the computer
	static abstract class sticks {
		static final int leftID = 0;
		static final int rightID = 1;
	}

	// Settings related to the Drive system
	static abstract class drive {
		static final int[] leftID = {10, 11, 12};
		static final int[] rightID = {4, 5, 6};
		static final boolean leftInverted = true;
		static final boolean rightInverted = false;
		static final Drive.DriveMode defaultMode = Drive.DriveMode.ARCADE;
		static final int arcadeButton = 7;
		static final int hybridButton = 8;
		static final int twistButton = 9;
		static final int tripleButton = 10;
		static final double leftThrottle = 1;
		static final double rightThrottle = 1;
		static final double throttle = 1;
		static final int dashboard = 0;
	}

	// Settings related to the Intake mechanism
	static abstract class intake {
		static final int ID = 8;
		static final boolean inverted = true;
		static final int forwardButton = 5;
		static final int reverseButton = 3;
		static final double speed = 1;
		static final int dashboard = 1;
	}

	// Settings related to the Conveyor mechanism
	static abstract class conveyor {
		static final int ID = 2;
		static final boolean inverted = true;
		static final int invertButton = 4;
		static final double speed = 0.6;
		static final int dashboard = 2;
	}

	// Settings related to the Shooting mechanism
	static abstract class shooter {
		static final int leftID = 1;
		static final int rightID = 7;
		static final boolean leftInverted = true;
		static final boolean rightInverted = false;
		static final int safetyButton = 1;
		static final int throttleAxis = 6;
		static final double angle = 60; // degrees
		static final double radius = 0; // inches
		static final double height = 0; // inches
		static final double inset = 0; // inches
		static final double constantSpeed = 0;
		static final double manualSpeed = 1;
		static final double coefficient = 0; // revolutions per second -> power
		static final int dashboard = 3;
	}

	// Settings related to the Climbing mechanism
	static abstract class climber {
		static final int leftID = 3;
		static final int rightID = 9;
		static final boolean leftInverted = false;
		static final boolean rightInverted = true;
		static final int safetyButton = 2;
		static final double speed = 0.4;
		static final int dashboard = 4;
	}

	// Information relating to the camera
	static abstract class camera {
		static final String ID = "USB Camera 0";
		static final int[] size = {640, 480};
		static final double fov = 50; // degrees
		static final double inset = 0; // inches
	}

	// Settings related to the Ultrasonic mechanism
	static abstract class ultrasonic {
		static final int leftID = 8;
		static final int rightID = 9;
		static final double spread = 1;
	}

	static abstract class vision {
		static final int distanceDashboard = 5;
		static final int angleDashboard = 6;
	}

	// Settings related to the Assist (alignment) system
	static abstract class assist {
		static final int angleButton = 1;
		static final int distanceButton = 2;
	}

	// Information relating to the game field Boiler
	static abstract class boiler {
		static final double height = 97; // inches
		static final double width = 15; // inches
	}

	static abstract class physics {
		static final double gravity = 386.09; // inches per second squared
	}

	static abstract class autonomous {
		static final double forwardSpeed = 0;
		static final double forwardTime = 0;
	}
}