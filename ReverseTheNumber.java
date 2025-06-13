package myfirstpackage;

public class ReverseTheNumber {

	public static void main(String[] args) 
	
	
	{
		int number =121345;
		int number2 = number;
		int reversed=0;
		while(number !=0)
		
		{	int digit = number%10;
		
		reversed = reversed *10+ digit;
		
		number = number /10;
	}
		System.out.println("the reversed numebr is "+reversed);
		
		if (number2==reversed)
			System.out.println("the number is palindorm");
		else
		System.out.println("nuber is not a palindorm");
	}

}
