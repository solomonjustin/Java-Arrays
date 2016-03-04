package Lab3;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Chapter7Lab3 {

	public static void main(String[] args) throws FileNotFoundException {
		//create scanner obj
		Scanner keys = new Scanner(System.in);
		
		int userIn;
		boolean result;
		
		System.out.print("Enter your charge account number: ");
		userIn = keys.nextInt();
		
		result = ChargeAccount.isValid(userIn);
		
		if(result)
			System.out.printf("The charge account number %d is valid!", userIn);
		else
			System.out.printf("The charge account number %d is not valid!", userIn);
		
		//close scanner
		keys.close();

	}

}
