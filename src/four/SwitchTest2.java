package four;

import java.util.Scanner;

public class SwitchTest2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		switch(m) {
		case 4:
		case 5:
		case 6:
			System.out.println("spring");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("summer");
			break;
		}
	} 

}
