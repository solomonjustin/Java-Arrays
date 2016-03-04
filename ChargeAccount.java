package Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChargeAccount {
	
	public static boolean isValid(int number) throws FileNotFoundException{
		
		int[] validNums = new int[18];
		
		File file = new File("Lab3/ValidNumbers.txt");
		Scanner reader = new Scanner(file);
		reader.useDelimiter(",");		
		
		for (int i = 0; i < validNums.length; i++) {
			if(reader.hasNext())
				validNums[i] = reader.nextInt();
		}
		
		reader.close();
		
		int i = searchArray(validNums, number);
		
		if(i >= 0)
			return true;
		else{
			return false;
		}
		
		
	}
	//search array
	private static int searchArray(int[] array, int number){
		
		int index, 
			element;
		boolean found;
		
		index = 0;
		element = -1;
		found = false;
		
		while(!found && index < array.length){
			if(array[index] == number){
				found = true;
				element = index;
			}
			else{
				++index;
			}
		}
		
		return element;
	}	

}
