package crackpack;

import java.util.Scanner;

public class CollectCrack //Collects all inputed data
{	
	Scanner input = new Scanner(System.in);
	CrackInfo info = new CrackInfo();
	
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
		
		info.start(checkYN);
		stringInput();
	}
	
	public void stringInput() 
	{
		System.out.print("Enter a string:");
		String SInput = input.nextLine();
		int StrInput = SInput.length();
		info.isCracked(StrInput);
		Firstnum();
	}
	
	public void Firstnum() 
	{
		System.out.print("Enter a number:");
		int numInput1 = input.nextInt();
		info.isFirstnum(numInput1);
		Secondnum();
	}
	
	public void Secondnum() 
	{
		System.out.print("Enter a second number:");
		int numInput2 = input.nextInt();
		info.isSecondnum(numInput2);
		System.out.print("Congrats, you cracked the code!!");
	}
}
