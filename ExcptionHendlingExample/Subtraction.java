package ExcptionHendlingExample;

public class Subtraction {

	public static void main(String[] args) {
		int a=10,b=0,c;
		try
		{
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
