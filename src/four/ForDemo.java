package four;


public class ForDemo
{
	public static void main(String[] args)
	{
		int count = 0;
		for (int x = 100; x <= 999; x++)
		{

			int a = x % 10;
			int b = x / 10 % 10;
			int c = x / 10 / 10 % 10;

			if ((a * a * a + b * b * b + c * c * c) == x)
			{
				count++;

			}

		}
		System.out.println(count);

	}

}
