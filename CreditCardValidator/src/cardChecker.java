public class cardChecker {


	public static boolean isNumberValid(long num)
	{
		String[] parsedNum = Long.toString(num).split("");
		
		int luhnTotal = 0; 
		for(int i = 0; i < parsedNum.length; i++)
		{
			
			if(i % 2 == 0)
			{
				
				int currentNumber = Integer.parseInt(parsedNum[i]);
				
				currentNumber *= 2;
				
				if(currentNumber >= 10)	
				{
					currentNumber = (currentNumber % 10) + (currentNumber / 10);
				}
				
				luhnTotal += currentNumber;
				
			}
			else
			{
				luhnTotal += Integer.parseInt(parsedNum[i]);
			}
			
		}
		return (luhnTotal % 10 == 0) ? true : false;
	}
}

