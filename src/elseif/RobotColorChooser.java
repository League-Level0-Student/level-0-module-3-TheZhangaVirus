//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		
		Robot rob = new Robot("mini");
		rob.setSpeed(100);
		//3. Ask the user what color they would like the robot to draw
		
		rob.penDown();
		
		//5. Use an if/else statement to set the pen color that the user requested
		
		for(int i = 0; i < 100; i++) {
		
		String color = JOptionPane.showInputDialog("what color do you want the robot to draw in? (red/green/blue/random)");
		
		if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(0, 0, 255);
		} else if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(255, 0, 0);
		} else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(0, 255, 0);
		} else {
			rob.setRandomPenColor();
		}
		
        //6. If the user doesn’t enter anything, choose a random color
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for(int s = 0; s < 4; s++) {
			rob.turn(90);
			rob.move(100);
		}
		}
	}
}


