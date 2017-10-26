package book.ch6;

public class BookException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message;
	
	public BookException() {
	
	}
	
	public BookException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
