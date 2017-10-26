package book.ch3;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String title0 = null;
		String title1 = null;
		String title2 = null;
		
		String content0 = null;
		String content1 = null;
		String content2 = null;
		
		int menuNum = 0;
		
		while(true) {
			
			System.out.println("===== 도서관리 프로그램 =====");
			System.out.println("1. 전체 도서 입력");
			System.out.println("2. 전체 도서 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print(": ");
			menuNum = input.nextInt();
			input.nextLine();
			
			switch(menuNum) {
			case 1:	// 전체 도서 입력
				System.out.println("===== 1. 전체 도서 입력 =====");
				System.out.println("[1/3]");
				System.out.println("도서 제목: ");
				title0 = input.nextLine();
				System.out.println("도서 내용: ");
				content0 = input.nextLine();
				
				System.out.println("[2/3]");
				System.out.println("도서 제목: ");
				title1 = input.nextLine();
				System.out.println("도서 내용: ");
				content1 = input.nextLine();
				
				System.out.println("[3/3]");
				System.out.println("도서 제목: ");
				title2 = input.nextLine();
				System.out.println("도서 내용: ");
				content2 = input.nextLine();
				
				break;
			case 2: // 전체 도서 출력
				System.out.println("===== 2. 전체 도서 출력 =====");
				
				System.out.println("[1/3]");
				System.out.println("- 도서제목: ");
				System.out.println(title0);
				System.out.println("- 도서내용: ");
				System.out.println(content0);	
				System.out.println();
				
				System.out.println("[2/3]");
				System.out.println("- 도서제목: ");
				System.out.println(title1);
				System.out.println("- 도서내용: ");
				System.out.println(content1);
				System.out.println();
				
				System.out.println("[3/3]");
				System.out.println("- 도서제목: ");
				System.out.println(title2);
				System.out.println("- 도서내용: ");
				System.out.println(content2);
				break;
			case 0:
				System.out.println("[Exit] 프로그램을 종료합니다...");
				input.close();
				return;
			default:
				System.out.println("[Error] 메뉴번호를 잘못 입력하였습니다. 다시 입력해 주세요");
				break;
			}
		}
	}
}
