package ExcptionHendlingExample;

import java.util.Scanner;

public class NormalPrgram {
	public static void main(String[]args)
	{
		Scanner s=new Scanner (System.in);
		try {
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter second nummbber");
		int b=s.nextInt();
		int c=a+b;
		System.out.println(c);
		}
		catch(Exception ex)
		{
			System.out.println("Please enter correct vlues");
		}
		finally
		{
			System.out.println("welcome");
		}
	}

}
