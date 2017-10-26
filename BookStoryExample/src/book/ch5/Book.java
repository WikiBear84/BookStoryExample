package book.ch5;

public class Book {
	private int bookNum;
	private String title;
	private String content;
	
	public Book() {
		
	}
	
	public Book(int bookNum, String title, String content) {
		this.bookNum = bookNum;
		this.title = title;
		this.content = content;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String toString() {
		String str = "책 번호:\n" + this.bookNum + "\n"
				+ "책 제목:\n" + this.title + "\n"
				+ "책 내용:\n" + this.content + "\n";
		return str;
	}
}
