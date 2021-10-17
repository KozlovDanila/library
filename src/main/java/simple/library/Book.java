package simple.library;

public class Book {

	private String author;
	private String name;
	private int pageCount;

	public Book(String author, String name, int pageCount) {
		this.author = author;
		this.name = name;
		this.pageCount = pageCount;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
}
