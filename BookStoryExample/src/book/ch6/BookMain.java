package book.ch6;

public class BookMain {
	public static void main(String[] args) {
		
		BookCUI cui = new BookCUI(2);
		try {
			cui.cuiStart();
		} catch (BookException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
