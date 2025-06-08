package myfirstpackage;

public class Result 

   {

	public static void main(String[] args)
	
	{
		int mathScore = 80;
		int sciScore = 78;
		int englishScore = 92;
		int totalScore;
		float averageScore;
		
		totalScore = mathScore + sciScore + englishScore;
		
		averageScore =  (totalScore / 3);
		
		System.out.println("the total score is "+totalScore);
		System.out.println("the average score is "+averageScore);
		
		// change the data type to double
		
		double changeDataType;
		
		changeDataType = averageScore ;
		
		// the data type is changed to double // the float data type can be saved in double as the memory space is bigger in double
		
	     System.out.println(changeDataType);
		
		
		
		
		
		
		
		
		

	}

}
