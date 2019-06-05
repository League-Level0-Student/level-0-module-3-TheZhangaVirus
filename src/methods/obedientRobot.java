package methods;


import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;


public class obedientRobot {

	public static void main(String[] args) {
		
		String shape = JOptionPane.showInputDialog("what shape do you want? (square/triangle/cricle");
		
		if(shape.equalsIgnoreCase("square")) {
			drawSquare();
		} else if(shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		} else if(shape.equalsIgnoreCase("circle")) {
			drawCircle();
		}
		
	}
	
	
	static void drawSquare() {
		
		Robot rob = new Robot("mini");
		
		String color1 = JOptionPane.showInputDialog("what color do you want? (enter 'r' value of rgb)");
		int r = Integer.parseInt(color1);
		String color2 = JOptionPane.showInputDialog("what color do you want? (enter 'g' value of rgb)");
		int g = Integer.parseInt(color2);
		String color3 = JOptionPane.showInputDialog("what color do you want? (enter 'g' value of rgb)");
		int b = Integer.parseInt(color3);
		rob.setPenColor(r, g, b);
		
		rob.penDown();
		rob.setSpeed(100);
		for(int i = 0; i < 4; i++) {
		rob.move(100);
		rob.turn(90);
		}
		
	}
	
	static void drawTriangle() {
		
		Robot rob = new Robot("mini");
		
		String color1 = JOptionPane.showInputDialog("what color do you want? (enter 'r' value of rgb)");
		int r = Integer.parseInt(color1);
		String color2 = JOptionPane.showInputDialog("what color do you want? (enter 'g' value of rgb)");
		int g = Integer.parseInt(color2);
		String color3 = JOptionPane.showInputDialog("what color do you want? (enter 'g' value of rgb)");
		int b = Integer.parseInt(color3);
		rob.setPenColor(r, g, b);
		
		rob.penDown();
		rob.setSpeed(100);
		for(int i = 0; i < 3; i++) {
		rob.move(100);	
		rob.turn(120);	
		}
		
	}
	
	static void drawCircle() {
		
		Robot rob = new Robot("mini");
		
		String color1 = JOptionPane.showInputDialog("what color do you want? (enter 'r' value of rgb)");
		int r = Integer.parseInt(color1);
		String color2 = JOptionPane.showInputDialog("what color do you want? (enter 'g' value of rgb)");
		int g = Integer.parseInt(color2);
		String color3 = JOptionPane.showInputDialog("what color do you want? (enter 'g' value of rgb)");
		int b = Integer.parseInt(color3);
		rob.setPenColor(r, g, b);
		
		rob.penDown();
		rob.setSpeed(100);
		for(int i = 0; i < 360; i++) {
		rob.move(1);	
		rob.turn(1);
		}
		
	}
	
}
