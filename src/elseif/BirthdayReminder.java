
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "Month, Day";
		String dadsBirthday = "Month, Day";
		String myBirthday = "Month, Day";

		// 2. Find out which birthday the user wants and and store their response in a variable
		
		String birthday = JOptionPane.showInputDialog("which birthday do you want? (mom/dad/me)");
		
		// 3. Print out what the user typed
		
		System.out.println(birthday);
		
		// 4. if user asked for "mom"
		if(birthday.equalsIgnoreCase("mom")){
			System.out.println(momsBirthday);
		} else if(birthday.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		} else if(birthday.equalsIgnoreCase("me")) {
			System.out.println(myBirthday);
		} else {
			System.out.println("sorry, I don't remember");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
