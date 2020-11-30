package ie.lyit.serialize;

import java.util.Scanner;

public class BookSerializer {

	
	
	
	
	
	public void list() {
		for(Book tmpBook:books)
			System.out.println(tmpBook);
	}
	
	public Book view() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("ENTER LIBRARY NUMBER OF BOOK: ");
		int bookToView = keyboard.nextInt();
		
		for(Book tmpBook:books) {
			if(tmpBook.getLibraryNumber() == bookToView) {
				System.out.println(tmpBook);
				return tmpBook;
			}
		}
		return null;
	}
	
	public void delete() {
		Book tempBook = view();
		
		if(tempBook != null)
			books.remove(tempBook);
		
	}
	
	public void edit() {
		Book tempBook = view();
		
		if(tempBook != null) {
			int index = books.indexOf(tempBook);
			tempBook.read();
			books.set(index, tempBook);
			
			
		}
	}

	public void deserializeBooks() {
		
	}

	public void add() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
