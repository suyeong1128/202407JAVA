package iterator;

import java.util.Iterator;

public class Main {
	public static void main(String[]args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World int 80 days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("cinderella"));
		bookShelf.appendBook(new Book("삼국지"));
		
		Iterator<Book> it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
		System.out.println();
		
		for(Book book:bookShelf) {
			System.out.println(book.getName());
		}
		System.out.println();
	}
}
