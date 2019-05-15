package elseif;

import javax.swing.JOptionPane;

public class happyOrNot {

	public static void main(String[] args) {
		
		String answer1 = JOptionPane.showInputDialog("Are you happy? (yes/no)");
		if(answer1.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		} else if(answer1.equalsIgnoreCase("no")) {
			String answer2 = JOptionPane.showInputDialog("Do you want to be happy? (yes/no)");
			if(answer2.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
				} else if(answer2.equalsIgnoreCase("no")) {
					JOptionPane.showMessageDialog(null,  "Keep doing whatever you're doing");
				}
			}
		}
		
	}

