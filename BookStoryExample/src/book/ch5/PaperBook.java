package book.ch5;

public class PaperBook extends Book {
	private String pbData;

	public PaperBook() {
		super();
		
	}

	public PaperBook(int bookNum, String title, String content, String pbData) {
		super(bookNum, title, content);
		this.pbData = pbData;
	}

	public String getPbData() {
		return pbData;
	}

	public void setPbData(String pbData) {
		this.pbData = pbData;
	}

	@Override
	public String toString() {
		String str = super.toString();
		str += "PaperBook Data:\n" + this.pbData + "\n";
		return str;
	}
	
	
}
