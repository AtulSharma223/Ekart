import java.util.*;
public class generateBill 
{
	Scanner sc=new Scanner(System.in);
	void getBill(Product arr[],int n)
	{
		int total=0;
		for(int i=0;i<n;i++)
		{
			total=total+arr[i].price;
		}		
		int choice;
		System.out.println("User type , Press\n1 for Guest\n2 for Club");
		choice =sc.nextInt();
		System.out.println("Your all kart items are as : ");
		System.out.println("Product Name     Price       Type");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i].productName+"       "+arr[i].price+"        "+arr[i].type);
		}
		System.out.println("Your total amount is : "+total);
		double amount=0;
		if(choice==1)
		{
			amount=new guest().bill(total);
			System.out.print("Your payble amount is   "+amount);
		}
		else if(choice==2)
		{
			amount=new club().bill(total);
			System.out.print("Your payble amount is     "+amount);
		}
		
	}
}
