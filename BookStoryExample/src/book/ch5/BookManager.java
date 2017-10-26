package book.ch5;

public class BookManager {
	private Book[] bookArray;
	private int baIndex;
	
	public BookManager(int bookArraySize) {
		bookArray = new Book[bookArraySize];
		baIndex = 0;
	}
	
	public void insertBook(Book book) {
		bookArray[baIndex++] = book;
	}
	
	public Book searchBook(int bookNum) {
		for (int i = 0; i < baIndex; i++) {
			if(bookArray[i].getBookNum() == bookNum) {
				return bookArray[i];
			}
		}
		return null;
	}
	
	public Book[] getBookList() {
		Book[] bookList = new Book[baIndex];
		for (int i = 0; i < baIndex; i++) {
			bookList[i] = bookArray[i];
		}
		return bookList;
	}
	
	public Book[] getBookListByType(int typeNum) {
		Book[] paperBookList = null;
		int pbListIndex = 0;
		int pbListSize = 0;
		
		Book[] audioBookList = null;
		int abListIndex = 0;
		int abListSize = 0;
		
		if (typeNum == 2) {
			for (int i = 0; i < baIndex; i++) {
				Book book = bookArray[i];
				if (book instanceof PaperBook) {
					pbListSize++;
				}
			}
			paperBookList = new Book[pbListSize];
			for (int i = 0; i < baIndex; i++) {
				Book book = bookArray[i];
				if (book instanceof PaperBook) {
					paperBookList[pbListIndex++] = book;
				}
			}
			return paperBookList;
		}
		else if (typeNum == 3) {
			for (int i = 0; i < baIndex; i++) {
				Book book = bookArray[i];
				if (book instanceof AudioBook) {
					abListSize++;
				}
			}
			audioBookList = new Book[abListSize];
			for (int i = 0; i < baIndex; i++) {
				Book book = bookArray[i];
				if (book instanceof AudioBook) {
					audioBookList[abListIndex++] = book;
				}
			}
			return audioBookList;
		}
		else if (typeNum == 1) {
			return getBookList();
		}
		return null;
	}
	
	public String checkBookType(String title) {
		String result = title.substring(0, 4);	
		return result;
	}
}
