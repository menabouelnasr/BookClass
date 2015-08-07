import java.text.DecimalFormat;
import java.util.Scanner;

public class Book 
{
	Scanner keyboard = new Scanner(System.in);
	int value, InStock, stock;
	private String title, author, description;
	private double price;

	public Book()
	{
		title= "";
		author= "";
		description= "";
		InStock= 0;
		price= 0;
	}
	
	public void setTitle(String title)
	{
		this.title= title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setAuthor(String author)
	{
		this.author= author;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setDescription(String description)
	{
		this.description= description;
	}
	
	public String getDescription()
	{
		return description;
	}
	public void setInStock(int InStock)
	{
		this.InStock= InStock;
	}
	public int getInStock()
	{
		return InStock;
	}
	public void setPrice(double price)
	{
		this.price= price;
	}
	public double getPrice()
	{
		return price;
	}
	
	public double totalPrice(int numberofBooks)
	{
		InStock=10;
		if(this.getInStock()>= numberofBooks)
		{
			return this.getPrice()*numberofBooks;
		}
		else
		{
			System.out.println("There are not enough books in stock. The price of each book is: "+ this.getPrice());
			return 0;
		}
	}
		
	}

