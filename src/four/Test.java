package four;

public class Test
{
	public static void main(String[] args)
	{
		int x = 2, y = 3;
		switch (x)
		{
		default:
			y++;
		case 2:
			y++;
			break;
		case 4:
			y++;

		}

		System.out.println("y=" + y);

	}
}