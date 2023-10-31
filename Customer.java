import java.util.*;

public class Customer 
{
	Scanner sc=new Scanner(System.in);
	int choice;
	int id;
	int password;
	int val;
	
	void checkUser(HashMap<Integer, Integer> map)
	{
		System.out.println("Press \n1 for login \n2 for sign up ");
		choice=sc.nextInt();
		check ck=new check();
		if(choice == 1)
		{
			val=ck.login(map);	
			if(val==1)
			{
				System.out.println("Succesfully login");
			}
			else
			{
				System.out.println("Wrong id or Password");
			}			
		}
		if(choice ==2)
		{
			val=ck.signup(map);
			if(val==0)
			{
				System.out.println("ID exist.Use Different ID");
			}
			else
			{
				System.out.println("User Created Successfully");
			}
		}
		
	}
	
	Product arr[]=new Product[10];
	int totalAmount;
	void addProduct()
	{
		int ct=0;
		int choice;
		while(true)
		{
			System.out.println("Press \n1 to add product \n2 for billing");
			choice =sc.nextInt();
			if(choice==2)
			{
				
				generateBill bill=new generateBill();
				bill.getBill(arr,ct);
				break;				
			}
			Product p1=new Product();
			arr[ct++]=p1;
			
		}
		
	}
	

}
