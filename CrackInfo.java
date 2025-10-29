package crackpack;

public class CrackInfo //checks all inputed info and sees if it fulfills the conditions to crack the code
{
	private int IsEven;
	private int OneLeft;
	
	public void start(String checkyes) 
	{
		if(!checkyes.equals("YES"))
		{
			System.out.println("Goodbye");
			System.exit(0);
		}
	}
	
	public void isCracked(int Strlen)
	{
		if(Strlen == 3)
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Wrong! Haiyaaah such a failure");
			System.exit(0);
		}
	}
	
	public void isFirstnum(int num1)
	{
		if(num1 >= 35 && num1 < 78 || num1 == 19)
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Wrong! Haiyaaah such a failure");
			System.exit(0);
		}
	}
	
	public void isSecondnum(int num2)
	{
		IsEven = num2 % 2;
		OneLeft = num2 % 10;
		if(IsEven == 0 || OneLeft == 1 && num2 > 0)
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Wrong! Haiyaaah such a failure");
			System.exit(0);
		}
	}
}
