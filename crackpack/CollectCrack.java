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
		
		System.out.print("Hi " + fname + " " + lname + ", are you ready to crack the code?");
		String YN = input.nextLine();
		String checkYN = YN.toUpperCase();
		
		if(YN == "YES")
		{
			
		}
		else 
		{
			
		}
		
	}
}
