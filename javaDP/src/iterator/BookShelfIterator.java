package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {

	private BookShelf bookShelf;
	private int index;
	
	//생성자
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	//다음 책이 있는지
	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	//다음 책을 가져올 때
	@Override
	public Book next() {
		if(!hasNext()) {
			throw new NoSuchElementException(); //예외 발생
		}
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
