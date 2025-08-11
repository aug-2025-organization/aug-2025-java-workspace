import java.util.Scanner;
import java.util.Set;

import com.bms.pojos.BookPojo;
import com.bms.service.BookService;

public class BMSMainPresentation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BookService bookService = new BookService();
		char option = 'n';
		do {
			System.out.println("******************************");
			System.out.println("BOOK MANAGEMENT SYSTEM MENU");
			System.out.println("******************************");
			System.out.println("1. Fetch all Books.");
			System.out.println("2. Fetch a Book.");
			System.out.println("3. Add a Book.");
			System.out.println("4. Update a Book.");
			System.out.println("5. Delete a Book.");
			System.out.println("6. Exit.");
			System.out.println("******************************");
			System.out.println("Enter Menu Option : ");
			int menuOption = scan.nextInt();
			System.out.println("******************************");
			switch(menuOption) {
				case 1 -> {
					Set<BookPojo> allBooks = bookService.getAllBooks();
					allBooks.forEach((eachBook) -> System.out.println(eachBook));
 				}
				case 2 -> {
					System.out.println("Enter the book(ID) to be fetched: ");
					int bookId = scan.nextInt();
					BookPojo fetchedBook = bookService.getABook(bookId);
					if(fetchedBook == null){
						System.out.println("Sorry! Book with ID: " + bookId + " does not exist!");
					} else {
						System.out.println(fetchedBook);
					}
				}
				case 3 -> System.out.println("Add a Book");
				case 4 -> System.out.println("Update a Book");
				case 5 -> {
					System.out.println("Enter the book(ID) to be removed: ");
					int bookId = scan.nextInt();
					BookPojo fetchedBook = bookService.getABook(bookId);
					if(fetchedBook == null){
						System.out.println("Sorry! Book with ID: " + bookId + " does not exist!");
					} else {
						System.out.println(fetchedBook);
					}
					System.out.println("Are you sure to remove this book? (y/n) : ");
					char remove = scan.next().charAt(0);
					if(remove == 'y') {
						bookService.deleteBook(bookId);
						System.out.println("Book with ID: " + bookId + " removed successfully!");
					} else {
						System.out.println("Book with ID: " + bookId + " not removed.");
					}
				}
				case 6 -> {
					System.out.println("******************************");
					System.out.println("Thankyou for using BMS");
					System.out.println("******************************");
					System.exit(0);
				}
			}
			System.out.println("******************************");
			System.out.println("Do you want ot continue ? (y/n) : ");
			option = scan.next().charAt(0);
		}while(option == 'y');
		
		System.out.println("******************************");
		System.out.println("Thankyou for using BMS");
		System.out.println("******************************");
	}
}
