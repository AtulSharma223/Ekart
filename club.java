
public class club extends Customer implements amountPayble
{
	@Override
	public double bill(double amount)
	{
		return amount*0.7;
	}

}
