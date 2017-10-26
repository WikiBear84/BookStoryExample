package book.ch6;

import book.ch6.AudioBook;
import book.ch6.Book;
import book.ch6.PaperBook;

public class BookManager {
	private Book[] bookArray;
	private int baIndex;
	
	public BookManager(int bookArraySize) {
		bookArray = new Book[bookArraySize];
		baIndex = 0;
	}
	
	public boolean isFull() throws BookException {
		if(baIndex >= bookArray.length) {
			return true;
		}
		throw new BookException("[Error] 입력오류: 배열이 가득 찼습니다");
	}
	
	public boolean insertBook(Book book) throws BookException {
		isFull();									// 배열이 가득 찼으면
		
		if (searchBook(book.getBookNum()) != null) {	// 이미 존재하는 책 번호이면
			throw new BookException("[Error] 입력오류: 이미 존재하는 책 번호입니다");
		}
		
		
		bookArray[baIndex++] = book;
		return true;
	}
	
	public Book searchBook(int bookNum) throws BookException {
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
	
	public Book[] getBookListByType(int typeNum) throws BookException {
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
		throw new BookException("[BookException] 리스트 생성 에러");
	}
	
	public String checkBookType(String title) throws BookException {
		String type = null;
		if (title.length() > 4) {
			type = title.substring(0, 4);
			
		}
		if (type == null || (!type.equals("[PB]") && !type.equals("[AB]"))) {
			throw new BookException("[Error] 체크에러: 책의 타입이 올바르지 않습니다."
					+ " 책 제목의 맨 앞의 책의 타입을 기입해야 합니다."
					+ " 책 제목에 들어갈 수 있는 책의 타입은 [PB]/[AB] 입니다.");
		}
		return type;
	}
}
