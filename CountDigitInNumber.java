package myfirstpackage;

public class CountDigitInNumber {

	public static void main(String[] args)
	
	{
		int i = 4567;
		
		int digit=0;
		
		int temp = i;
		
		while(temp!=0) 
		
		{
			temp = temp/10; // the ccount of digit increases by one for each iteration for untill the temp becomes 0 with each division 
			                 // hence the number of increments in the digit will be equatl to the number of divisions which is the number of digit i the number 
			digit++;
			
		}
		System.out.println("number of digit is "+digit);	
	}

}
