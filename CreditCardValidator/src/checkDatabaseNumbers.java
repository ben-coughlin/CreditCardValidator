import java.util.ArrayList;


public class checkDatabaseNumbers {

	public static int countValidNumsInDatabase()
	{
		ArrayList<Long> cards = TextReader.getCards();
		
		int numValid = -1;
		
		for(long card : cards)
		{
			if(cardChecker.isNumberValid(card))
			{
				numValid++;
			}
		}
		
		return numValid;
	}
	
	public static void listIndividualCards()
	{
		
		ArrayList<Long> cards = TextReader.getCards();
		
		
		for(long card : cards)
		{
			
			System.out.println((cardChecker.isNumberValid(card) ? "Valid Card Number: " : "Invalid Card Number: ") + card);
		}
	}
}
