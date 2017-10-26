package book.ch1;

public class BookMain {
	public static void main(String[] args) {
		final double PI = 3.14;			// 원주율
		int diameter = 22;				// 1층 지름
		int bookshelfSize = 2;			// 책장 길이
		int bookNumOfOneShelf = 70;		// 선반당 책의 수
		int numOfShelf = 14;			// 책장의 선반 수
		
		int allShelves;					// 총 책장의 수
		int allBookNum;					// 총 책의 수
		
		// 도서관의 둘레
		double sizeOfLibrary = diameter * PI;
		
		// 도서관에 들어갈 수 있는 총 책장의 수
		allShelves = (int)(sizeOfLibrary / bookshelfSize);
		
		// 도서관에 들어갈 수 있는 총 책의 수
		allBookNum = allShelves * numOfShelf * bookNumOfOneShelf;
		
		System.out.println("일층에 들어갈 수 있는 총 책의 권수는 [" + allBookNum + "]권 입니다.");
		
		
	}
}
