import java.util.*;

public class UserKart {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map = new HashMap<>();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			Customer c1=new Customer();
			c1.checkUser(map);
			if(c1.val==0)
			{
				continue;
			}
			
			c1.addProduct();
			
			System.out.println("\n Press \n1 for next user \n2 for exit");
			int choice;
			choice=sc.nextInt();
			if(choice==2)
			{
				break;
			}
			
		}

	}

}
