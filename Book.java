package packing;

public class Book {
	private String bookName;
	private int bookCode;
	private int bookPrice;
	private String bookCategory;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	
	
	
	
	public Book() {
		super();
	}
	public Book(String bookName, int bookCode, int bookPrice, String bookCategory) {
		super();
		this.bookName = bookName;
		this.bookCode = bookCode;
		this.bookPrice = bookPrice;
		this.bookCategory = bookCategory;
	}
	
}
