package four;

import java.util.Scanner;

public class SwitchTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("请选择：");
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入：");
		
		String choice=sc.nextLine();
		
		

		switch(choice)
		{
		case "A":
			System.out.println('A');
		    break;
		case "B":
			System.out.println('B');
			break;
		case "C":
			System.out.println('C');
			break;
		case "D":
			System.out.println('D');
			break;
		default:
			System.out.println("错误");
			break;
		}
		
	}

}
