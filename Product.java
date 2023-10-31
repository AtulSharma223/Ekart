import java.util.Scanner;

public class Product 
{
	String productName;
	int price;
	String type;	
	
	Scanner sc=new Scanner(System.in);
	
	Product()
	{
		System.out.print("Enter product name : ");
		productName=sc.next();
		
		System.out.print("Enter product price : ");
		price=sc.nextInt();
		
		System.out.print("Enter product type : ");
		type=sc.next();
	}
	
	

}
