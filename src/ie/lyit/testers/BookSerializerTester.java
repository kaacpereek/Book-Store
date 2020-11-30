package ie.lyit.testers;

import ie.lyit.book.*;
import ie.lyit.serialize.BookSerializer;

public class BookSerializerTester {

	public static void main(String[] args) {
		BookSerializer bookSerializer = new BookSerializer();
		
		bookSerializer.deserializeBooks();
		
		Menu menu = new Menu();
		
		do {
			menu.display();
			menu.readOption();
			
			switch(menu.getOption()) {
				case 1:bookSerializer.add();break;
				case 2:bookSerializer.list();break;
				case 3:bookSerializer.view();break;
				case 4:bookSerializer.edit();break;
				case 5:bookSerializer.delete();break;
				case 6:break;
			}
		}while(menu.getOption() != 6);

	}

}
