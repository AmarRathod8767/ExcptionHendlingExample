package ExcptionHendlingExample;

import java.util.Scanner;

public class Division {

	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int a=0,b=0,c=0;
		try
		{
			System.out.println("Enter first number");
			a=s.nextInt();
			System.out.println("Enter Second number");
			b=s.nextInt();
			c=a/b;
			System.out.println(c);
		}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			c=a+b;
			System.out.println(c);
		
		
	}
}
