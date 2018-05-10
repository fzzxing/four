package four;

public class XiaoFang
{
	public static void main(String[] args)
	{
		double dayMoney = 2.5;
		int day = 1;
		double sumMoney = 0;
		double result = 100;
		while (true)
		{
			sumMoney += dayMoney;
			if (sumMoney >= result)
			{
				break;
			}
			if (day % 5 == 0)
			{
				sumMoney -= 6;
			}

			day++;

		}
		System.out.println(day);
	}

}
