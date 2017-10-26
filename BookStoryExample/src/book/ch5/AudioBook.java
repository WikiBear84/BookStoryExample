package book.ch5;

public class AudioBook extends Book {
	private String abData;

	public AudioBook() {
		super();
		
	}

	public AudioBook(int bookNum, String title, String content, String abData) {
		super(bookNum, title, content);
		this.abData = abData;
	}

	public String getAbData() {
		return abData;
	}

	public void setAbData(String abData) {
		this.abData = abData;
	}

	@Override
	public String toString() {
		String str = super.toString();
		str += "AudioBook Data:\n" + this.abData + "\n";
		return str;
	}
	
	
}
