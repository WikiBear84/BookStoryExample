package etc.ch5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		
		
		
		String result = str.substring(0, 4);
		
		System.out.println(result);
	}
}
