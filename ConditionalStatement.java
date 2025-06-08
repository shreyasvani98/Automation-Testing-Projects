package myfirstpackage;

public class ConditionalStatement 

    {

	
	public static void main(String[] args) 
	
	{
		
	int mathScore = 30;
	int scienceScore =100;
	int englishScore =49;
	
	
        int	totalScore = mathScore + scienceScore + englishScore;
 
        double averageScore = totalScore / 3;
        
        System.out.println("the average score is "+ averageScore);
        
       if(averageScore>=90 && averageScore<=100)
    	   
       { System.out.println("students grade is A+");
       System.out.println("Excellent performance");}
       
       
       else if (averageScore>=75 && averageScore<=89)
    	   {
    	      System.out.println("students grade is A");
    	      System.out.println("Excellent performance");
    	   }
       
       
       else if (averageScore>=60 && averageScore<=74)
    	   
       {   
    	   System.out.println("students grade is B");
    	   System.out.println("keep improving");
       }
       
       else if (averageScore>=40 && averageScore<=59)
    	   
       {
    	   System.out.println("students grade is c");
           System.out.println("keep improving");
       }
    
       
       else if (averageScore<40)
       {
    	   System.out.println("student has failed");
    	   System.out.println("please work harder next time");
       }
       
       
       if (mathScore<35 || scienceScore<35 || englishScore<35)
    	   System.out.println("failed due to low score in atleast one subject");
       
       
    
 
	

	}

}
