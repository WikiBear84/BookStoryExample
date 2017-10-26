package etc.ch4;

import java.util.Scanner;

public class Kiko {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int appleSum = 0;
		int bananaSum = 0;
		while(true) {
			String str = input.nextLine();
			
			switch (str) {
			case "exit":
				System.out.println("바나나: " + bananaSum);
				System.out.println("사과: " + appleSum);
				return;
			default:
				
				String[] array = str.split(":");
				if(array[0].equals("바나나")) {
					bananaSum += Integer.parseInt(array[1]);
				}
				else if (array[0].equals("사과")) {
					appleSum += Integer.parseInt(array[1]);
				}
				
				break;
			}
		}
	}
}
