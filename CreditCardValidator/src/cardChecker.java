import java.util.InputMismatchException;
import java.util.Scanner;

public class cardChecker {

	public static int getUserCardNumber()
	{
		int num = -1;
		try
		{
			
			Scanner numScn = new Scanner(System.in);

			System.out.println("Hello! Please enter a card number to check: ");

			num = numScn.nextInt();

			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid card number.");
			getUserCardNumber();
		}
		if(num == -1)
		{
			System.out.println("Invalid card number.");
			getUserCardNumber();
		}
		return num;
	
	}
	public static boolean isNumberValid(long num)
	{
		String[] parsedNum = Long.toString(num).split("");
		
		for(int i = 1; i < parsedNum.length; i+= 2)
		{
			System.out.println(i);
		}
		return false;
	}
}

