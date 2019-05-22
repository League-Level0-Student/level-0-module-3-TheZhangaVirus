package elseif;

import javax.swing.JOptionPane;

public class horoscope {

	public static void main(String[] args) {
		
		/* The 12 signs are Aries, Taurus,
		 * Gemini, Cancer, Leo, Virgo, Libra, Scorpio,
		 * Sagittarius, Capricorn, Aquarius and Pisces.
		 */
		
		String horoscope = JOptionPane.showInputDialog("what is your star sign");
		
		if(horoscope.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Why not say yes a little more than usual, Aries?");
			System.exit(0);
		} else if(horoscope.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "You could write fiction or journalism well today.");
			System.exit(0);
		} else if(horoscope.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "Today is your day, Gemini!");
			System.exit(0);
		} else if(horoscope.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "You have an excellent day ahead, Cancer.");
			System.exit(0);
		} else if(horoscope.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "The day's aspects are bound to inspire you!");
			System.exit(0);
		} else if(horoscope.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "There are some wonderful surprises in store for you, Virgo.");
			System.exit(0);
		} else if(horoscope.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "You can look forward to a day full of satisfaction, Libra. ");
			System.exit(0);
		} else if(horoscope.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "You're definitely going to appreciate the harmony today, Scorpio.");
			System.exit(0);
		} else if(horoscope.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "Much as you believe otherwise, society isn't trying to stifle you or stop you from being you, Sagittarius.");
			System.exit(0);
		} else if(horoscope.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Perhaps you should try to be braver than you've been. It would be worth it.");
			System.exit(0);
		} else if(horoscope.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Your strong will and desire to be appreciated get in your way. It isn't easy to express yourself authentically when you're trying to make an impression on others.");
			System.exit(0);
		} else if(horoscope.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "Think about tolerance, Pisces, and notice to what extent it can liberate you.");
			System.exit(0);
		} else {
			JOptionPane.showMessageDialog(null, "that's not a star sign");
			System.exit(0);
		}
	}
	
}