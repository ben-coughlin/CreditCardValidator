import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TextReader {
	
	
	
	private static ArrayList<Integer> cardList = new ArrayList<Integer>();
	private static String fileName = "CardList.txt";
	
	public static void runFileReader()
	{
		

	
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
			String line = br.readLine();
			
			while(line != null)
			{
				
				//System.out.println(line);
				int currentCard = Integer.parseInt(line);
				cardList.add(currentCard);
				line = br.readLine();
			}
				
			br.close();

		} 
		catch(IOException e)
		{
			System.out.println("Whoops, an error occured reading the file.");
			
		}
	}

	public static ArrayList<Integer> getCards() {
		return cardList;
	}

	
	
	
	
}
