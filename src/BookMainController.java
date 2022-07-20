import java.util.Scanner;

public class BookMainController {

	public static void main(String[] args) {
		try {
		int bookId=0;
		String title=null;
		double price;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Book ID :");
		bookId=sc.nextInt();
		System.out.println("Enter Book Title :");
		title=sc.next();
		System.out.println("Enter Book PRice");
		price=sc.nextDouble();
		//create object of bookservice 
		BookService bookService=new BookService();
		
		int t=bookService.addBookService(bookId,title,price);
		
		System.out.println("Main Controller return value form DAO :"+t);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
