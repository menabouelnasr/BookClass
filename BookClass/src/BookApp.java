import java.text.DecimalFormat;
import java.util.Scanner;

public class BookApp 
{

	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("$###,###.00");
		System.out.println("Welcome to the Product Selector");
		
		Scanner keyboard = new Scanner(System.in);
		String choice="y";
		
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.println("Please enter your book title");
			String bookTitle= keyboard.next();
			System.out.println("Please enter the quantity of books you would like to price.");
			int numberofBooks= keyboard.nextInt();
			
			Book book= BookDB.getBook(bookTitle);
			
			System.out.println("Selected Product: " + book.getDescription());
			System.out.println("Price: " + df.format(book.totalPrice(numberofBooks)));
			
			System.out.println("Would you like to continue? (y/n)");
			choice= keyboard.next();
		}

	}

}
