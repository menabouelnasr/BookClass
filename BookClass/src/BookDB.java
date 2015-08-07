public class BookDB 
{
	public static Book getBook(String bookTitle) 
	{
		Book a = new Book();

		a.setTitle("Book Title");
		if(bookTitle.equalsIgnoreCase("java"))
		{
			a.setDescription("Murach's Beginning Java");
			a.setPrice(49.50);
		}
		else if (bookTitle.equalsIgnoreCase("jsps"))
		{
			a.setDescription("Murach's Java Servlets and JSP");
			a.setPrice(49.50);
		}
		else if (bookTitle.equalsIgnoreCase("mcb2"))
		{
			a.setDescription("Murach's Mainfram COBOL");
			a.setPrice(59.50);
		}
			else
			{
				a.setDescription("Unknown");
			}
	return a;
		
	}

}
