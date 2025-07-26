package JavaOOPSTask2;

class Book {
	String title;
	String author;
	double price;

	void displayDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: ₹" + price);
		System.out.println();
	}
}

public class createBOOKclass {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "Harry Potter";
		book1.author = "J.K. Rowling";
		book1.price = 799.99;

		Book book2 = new Book();
		book2.title = "The Alchemist";
		book2.author = "Paulo Coelho";
		book2.price = 499.50;

		book1.displayDetails();
		book2.displayDetails();
	}
}
