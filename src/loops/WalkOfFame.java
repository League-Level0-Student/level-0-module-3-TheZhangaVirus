
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		
		int starSize = 30;
		int X = 50;
		int robX = 200;
		Robot rob = new Robot("mini");
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(robX);
		rob.turn(90);
		rob.setSpeed(100);
		rob.penDown();
		// 2. Make the robot draw a star shape. Hint: 144.
		
		for(int l = 1; l < 11; l++) {
			for(int i = 0; i < 5; i++) {
				rob.move(starSize);
				rob.turn(144);
			}
			rob.setX(robX + (l * X));
		// 3. Set the size of the star to 30.
		}
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
