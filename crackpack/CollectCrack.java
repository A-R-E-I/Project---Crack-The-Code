package crackpack;

import java.util.Scanner;

public class CollectCrack 
{
	
	Scanner input = new Scanner(System.in);
	
	public void inputs() 
	{
		
		
		
		System.out.println("Welcome!!");
		
		System.out.print("Enter firstname: ");
		String fname = input.nextLine();
		System.out.print("Enter lastname: ");
		String lname = input.nextLine();
		
		System.out.print("Hi " + fname + " " + lname + ", are you ready to crack the code?");
		String YN = input.nextLine();
		String checkYN = YN.toUpperCase();
		
		if(checkYN == "YES")
		{
			codeInput();
		}
		else 
		{
			System.out.println("Goodbye");
		}
		
		
	}
	
	public void codeInput() 
	{
		System.out.print("Enter a string:");
		String SInput = input.nextLine();
		Int StrInput = SInput.length();
	}
}
