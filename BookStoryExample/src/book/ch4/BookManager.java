package book.ch4;

public class BookManager {
	private Book[] bookArray;
	private int baIndex;
	
	public BookManager() {
		bookArray = new Book[33320];
		baIndex = 0;
	}
	
	public void insertBook(Book book) {
		bookArray[baIndex++] = book;
	}
	
	public Book[] getBookList() {
		Book[] bookList = new Book[baIndex];
		for (int i = 0; i < baIndex; i++) {
			bookList[i] = bookArray[i];
		}
		return bookList;
	}
}
