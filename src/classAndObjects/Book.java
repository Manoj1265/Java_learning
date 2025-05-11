package classAndObjects;

public class Book {

	static int totalBooks;

	String title;
	String author;
	String isbn;
	boolean isBorrowed;
	static {
		totalBooks = 0;
	}

	{
		totalBooks++;
	}
	
	Book(String title, String author, String isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	
	Book(String isbn){
		this(isbn, "Unkown", "Unknown");
	}

	public void borrowBook() {
		if (isBorrowed) {
			System.out.println("The Book is alredy Borrowed.");
		} else {
			isBorrowed = true;
			System.out.println("Enjoy Reading");
		}
	}

	public void returnBook() {
		if(isBorrowed) {
			isBorrowed=false;
			System.out.println("Thank You! Please Leave a review.");
		}else {
			System.out.println("The book is already in Library.");
		}
	}

	public static int getTotalBooks() {
		return totalBooks;
	}
	
	public static void main(String[] args) {
		Book designs = new Book("1", "Art", "Author");
		Book textBook = new Book("2");
		textBook.borrowBook();
		designs.returnBook();
		designs.borrowBook();
		System.out.println(Book.getTotalBooks());
		textBook.returnBook();
		designs.returnBook(); 
	}
}
