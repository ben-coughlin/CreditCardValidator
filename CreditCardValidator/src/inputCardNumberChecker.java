import java.util.InputMismatchException;
import java.util.Scanner;

public class inputCardNumberChecker {

	public static boolean getUserCardNumber()
	{
		long num = -1;
		try
		{
			
			Scanner numScn = new Scanner(System.in);

			System.out.println("Hello! Please enter a card number to check: ");

			num = numScn.nextLong();

			
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
		
		return cardChecker.isNumberValid(num);
	
	}
	
	public static void formatUserCardNumber()
	{
		System.out.println("The number you entered was" + ((getUserCardNumber()) ? " " : " not ") + "valid.");
	}
}
