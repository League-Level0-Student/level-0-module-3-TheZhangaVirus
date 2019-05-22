package loops;

public class yearsAlive {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			int years = 2004 + i;
			System.out.println(years);
			if(years >= 2019) {
				System.exit(0);
			}
		}
		
	}

}
