import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Chains_of_proteins {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Creating variables for pair and their number
		String s1 = null,s2 = null;	
		int numberPair = 1 ;
		
		//Open file data.txt
		File Way = new File("D:\\data.txt");
		Scanner fileReader = new Scanner(Way);
		
		//Providing operations and showing results
		while(fileReader.hasNextLine())
		{	
			//Cycle for receiving chains	
			if(numberPair == 1) 
			{
				s1=readingChain(fileReader);
			}
			else
			{
				s1 = s2;
			}
		
		s2=readingChain(fileReader);
	
		//Showing selected pair
		System.out.println(numberPair+" pair of proteins \nFirst chain - "+s1+"\nSecond chain - "+s2);
		
		//Starting comparing and showing the results
		if (changePossible(s1,s2))
		{
			System.out.println("Chain "+s1+" could be created by using pair "+s2+"\nAnswer is Yes \n");
		}
		else
		{
			System.out.println("Chain "+s1+" couldn't be created by using pair "+s2+"\nAnswer is NO \n");
		}
		numberPair++;
		}
		
		//Close opened file dane.txt
		fileReader.close();
	}
	
	//Class for providing comparing
	static boolean changePossible(String s1,String s2)
	{
		//Creating variables
		int s1Length = s1.length() , s2Length = s2.length();
		
		//Checking if the numbers of elements in chains are equal
		if (s1Length != s2Length)
		{
		return false;
		}
		
		//These loops will provide comparison
		//Start first loop and initialize index of elements from first chain
		for(int i = 0 ; i < s1Length ; i++)
		{	
			//Start second loop and initialize index of elements from second chain
		    for(int currentPosition = 0 ; currentPosition < s2Length ; currentPosition++)
		    {	
		    //In case if we find the same element in both chains	
			if(s1.charAt(i) == s2.charAt(currentPosition))
			{
				s1 = s1.substring(0, i)+"?"+s1.substring(i+1, s1Length);
			   	s2 = s2.substring(0, currentPosition)+"!"+s2.substring(currentPosition+1 , s2Length);
			   	currentPosition = 0;
			   	break;
			}
			//If the number of specific element in first chain doesn't equal to the number of the same element in second chain
			else
			{
				int dif = s2Length - currentPosition;
				if(dif == 1)
				{
					return false;
				}
			}
		    }
		}
		
		//And if we could create first chain using only the same elements and the same number of each specific element from the second chain 
		return true;
	}

	//Class for reading require chain of proteins
	static String readingChain(Scanner fileReader) throws FileNotFoundException
	{
		String chain = null;
		
		if(fileReader.hasNextLine())
		{
		chain = fileReader.nextLine();
		}
		
		//Sending required chain
		return chain;
	}
}
