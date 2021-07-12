package array;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {}
	
	public Book(String bookName, String author) { // 책 이름과 저자 이름을 매개변수로 받는 생성자
		this.bookName = bookName;
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAutor(String author) {
		this.author = author;
	}
	public void showBookInfo() {	// 책 정보를 출력해주는 메서드
		System.out.println(bookName + "," + author);
	}
}
