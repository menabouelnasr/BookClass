import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineItem 
{
	public static void main(String[] args) 
	{
		double untaxable_subtotal=0, price, taxRate,a, subtotal=0, tax, total;
		int i;
		String taxable;
		
		List<Double> array = new ArrayList<Double>();
		Scanner keyboard = new Scanner(System.in);
		 DecimalFormat dFormat = new DecimalFormat("####,###,###.00");
		 DecimalFormat dFormat2 = new DecimalFormat("###,###,###.000");
		
		System.out.println("Please enter your tax rate.");
		taxRate=keyboard.nextDouble();
		
		System.out.println("Please enter the price of item 1:");
		price=keyboard.nextDouble();
		array.add(price);
		System.out.println("Is this item taxable? (Y/N)");
		taxable=keyboard.next();
		if (taxable.equalsIgnoreCase("n"))
		{
			untaxable_subtotal=price;
		}
		
		
		for (i=2; ;i++)
			{
			
			if (price==0.0)
				break;
				System.out.println("Please enter the price of item "+ i+  ":");
				price=keyboard.nextDouble();
				System.out.println("Is this item taxable? (Y/N)");
				taxable=keyboard.next();
				if (taxable.equalsIgnoreCase("n"))
				{
					untaxable_subtotal+=price;
				}
				array.add(price);
				
			}
		a=array.size();
		
		for (i=0; i <a-1 ;i++)
		{
			subtotal += array.get(i);
		}
		tax= taxRate*subtotal;
		total= tax + subtotal;
		
		System.out.println("$" + dFormat.format(subtotal) + " subtotal");
		System.out.println("$" + dFormat.format(untaxable_subtotal) + " untaxable subtotal");
		System.out.println("$" + dFormat2.format(tax) + " tax");
		System.out.println("$" + dFormat.format(total) + " grand total");
		
	}

}
