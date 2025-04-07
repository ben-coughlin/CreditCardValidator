import java.util.ArrayList;

public class checkDatabaseNumbers {

	public static int countValidNumsInDatabase()
	{
		ArrayList<Integer> cards = TextReader.getCards();
		
		int numValid = -1;
		
		for(int card : cards)
		{
			if(cardChecker.isNumberValid(card))
			{
				numValid++;
			}
		}
		
		return numValid;
	}
}
