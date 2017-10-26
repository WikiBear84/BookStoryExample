package book.ch4;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menuNum = 0;
		BookManager bm = new BookManager();
		
		while(true) {
			System.out.println("===== 도서관리 프로그램 =====");
			System.out.println("1. 도서 입력");
			System.out.println("2. 도서 출력(전체)");
			System.out.println("0. 프로그램 종료");
			System.out.print(": ");
			
			menuNum = input.nextInt();
			input.nextLine();
			
			switch(menuNum) {
			case 1: // 도서 전체 입력
				System.out.println("===== 1. 도서 입력 =====");
				
				System.out.println("책 번호: ");
				int bookNum = input.nextInt();
				input.nextLine();
				System.out.println("제목: ");
				String title = input.nextLine();
				System.out.println("내용: ");
				String content = input.nextLine();
				Book b = new Book(bookNum, title, content);
				
				bm.insertBook(b);
				
				break;
			case 2: // 도서 전체 출력
				System.out.println("===== 2. 도서 전체 출력 =====");
				Book[] bookList = bm.getBookList();
				
				for(int i = 0; i < bookList.length; i++) {
					System.out.println(bookList[i].toString());
				}
				
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
	
}
