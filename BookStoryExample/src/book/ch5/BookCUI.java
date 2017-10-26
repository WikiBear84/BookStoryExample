package book.ch5;

import java.util.Scanner;

public class BookCUI {
	private Scanner input;
	private int menuNum;
	private BookManager bm;
	
	public BookCUI(int bookArraySize) {
		input = new Scanner(System.in);
		menuNum = 0;
		bm = new BookManager(bookArraySize);
	}
	
	public void cuiStart() {
		while(true) {
			System.out.println("===== 도서관리 프로그램 =====");
			System.out.println("1. 도서 입력");
			System.out.println("2. 도서 출력");
			System.out.println("3. 도서 검색(책번호)");
			System.out.println("0. 프로그램 종료");
			System.out.print(": ");
			
			menuNum = input.nextInt();
			input.nextLine();
			
			switch(menuNum) {
			case 1: // 도서 전체 입력
				this.insertBook();
				break;
			case 2: // 도서 출력
				this.printBook();
				break;
			case 3: // 도서 검색(책번호)
				this.searchBook();
				break;
			case 0:
				System.out.println("[Exit] 프로그램을 종료합니다...");
				input.close();
				return;
			default:
				System.out.println("[Error] 메뉴를 다시 입력해 주세요");
				break;
			}
		}
	}
	
	public void insertBook() {
		System.out.println("===== 1. 도서 입력 =====");
		
		System.out.println("책 번호: ");
		int bookNum = input.nextInt();
		input.nextLine();
		System.out.println("제목: ");
		String title = input.nextLine();
		System.out.println("내용: ");
		String content = input.nextLine();
		Book b = null;
		
		// 책의 제목의 앞글자를 분석해서 만들 객체의 종류를 선택한다.
		String titleCheck = bm.checkBookType(title);
		
		if (titleCheck.equals("[PB]")) {
			System.out.println("PaperBook Data:");
			String pbData = input.nextLine();
			b = new PaperBook(bookNum, titleCheck, content, pbData);
		}
		else if (titleCheck.equals("[AB]")) {
			System.out.println("AudioBook Data:");
			String abData = input.nextLine();
			b = new AudioBook(bookNum, titleCheck, content, abData);
		}
		
		
		bm.insertBook(b);
		
	}
	
	public void printBook() {
		System.out.println("===== 2. 도서 출력 =====");
		System.out.println("1. 전체 출력");
		System.out.println("2. PaperBook 출력");
		System.out.println("3. AudioBook 출력");
		System.out.println(":");
		int typeNum = input.nextInt();
		input.nextLine();
		
		Book[] bookList = bm.getBookListByType(typeNum);
		
		for(int i = 0; i < bookList.length; i++) {
			System.out.println(bookList[i].toString());
		}
	
	}
	
	public void searchBook() {
		System.out.println("===== 3. 도서 검색(책 번호) =====");
		System.out.println("검색할 책 번호: ");
		int bookNum = input.nextInt();
		Book sBook = bm.searchBook(bookNum);
		
		System.out.println(sBook.toString());
	}
	
}
