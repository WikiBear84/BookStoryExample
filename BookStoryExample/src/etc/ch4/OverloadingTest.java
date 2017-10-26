package etc.ch4;

public class OverloadingTest {
	public int methodA(int a) {
		return a + 10;
	}
	
	public double methodA(double a) {
		return a + 12.5;
	}
	
/*	public double methodA(int a) {
		return a + 12.5;
	}*/
	
	public int methodA(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		OverloadingTest over = new OverloadingTest();
		System.out.println(over.methodA(10));
	}
}
