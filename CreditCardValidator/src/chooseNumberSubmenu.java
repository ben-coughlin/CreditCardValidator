import java.util.InputMismatchException;
import java.util.Scanner;

public class chooseNumberSubmenu {

	public static void chooseUserNumberOrDatabaseNumber()
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("\nWould you like to input a card number or use a number from the database?");
		System.out.println("Press 1 for input.");
		System.out.println("Press 2 to get the number of valid cards in the database.");
		System.out.println("Press 3 to list each card individually. \n");
		
		int answer = scn.nextInt();

		try
		{
			if(answer == 1)
			{
				inputCardNumberChecker.formatUserCardNumber();
				chooseUserNumberOrDatabaseNumber();
			}
			else if(answer == 2)
			{
				System.out.println("There are " + checkDatabaseNumbers.countValidNumsInDatabase() + " valid card numbers in the database.");
				chooseUserNumberOrDatabaseNumber();
				
			}
			else if(answer == 3)
			{
				checkDatabaseNumbers.listIndividualCards();
				chooseUserNumberOrDatabaseNumber();
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("That's not a choice silly goose");
			chooseUserNumberOrDatabaseNumber();
			
		}
	}
}
