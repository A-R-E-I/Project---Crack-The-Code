package crackpack;

import java.util.Scanner;

public class CollectCrack 
{
	public void inputs() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome!!");
		
		System.out.print("Enter firstname: ");
		String fname = input.nextLine();
		System.out.print("Enter lastname: ");
		String lname = input.nextLine();
		
		System.out.println("Hi " + fname + " " + lname + ", are you reeady to crack the code?");
		
	}
}
