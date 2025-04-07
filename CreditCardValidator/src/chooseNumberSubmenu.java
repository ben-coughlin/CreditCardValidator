import java.util.InputMismatchException;
import java.util.Scanner;

public class chooseNumberSubmenu {

	public static void chooseUserNumberOrDatabaseNumber()
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Would you like to input a card number or use a number from the database?");
		System.out.println("Press 1 for input.");
		System.out.println("Press 2 to get the number of valid cards in the database.");
		System.out.println("Press 3 to list each card individually. \n");


		try
		{
			if(scn.nextInt() == 1)
			{
				cardChecker.getUserCardNumber();
			}
			else if(scn.nextInt() == 2)
			{
				checkDatabaseNumbers.countValidNumsInDatabase();
			}
			else if(scn.nextInt() == 3)
			{
				
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("That's not a choice silly goose");
			
		}
	}
}
