import java.util.*;
public class check 
{
	HashMap<Integer, Integer> map = new HashMap<>();
	Scanner sc=new Scanner(System.in);
	int id;
	int password;
	int login(HashMap<Integer, Integer> map)
	{
		System.out.println("Enter id and Password");
		id=sc.nextInt();
		password=sc.nextInt();
		
		if(map.containsKey(id))
		{
			if(password==map.get(id))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return 0;
		}		
	}
	int signup(HashMap<Integer,Integer>map)
	{
		System.out.println("Create ID and Password");
		int id=sc.nextInt();
		if(map.containsKey(id))
		{
			return 0;
		}
		else
		{
			int password=sc.nextInt();
			map.put(id, password);
			return 1;
		}
	}

}
