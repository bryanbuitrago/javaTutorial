package javaTut3DB;

public class JavalessonThree {
	
	public static void main(String[] args)
	{
		char theGrade = 'b';
		
		switch (theGrade)
		{
		case 'A':
			System.out.println("Great job");
			break;
		case 'B' | 'b':
			System.out.println("Good job");
			break;
		
		case 'C':
			System.out.println("OK");
			break;
		
		case 'D':
			System.out.println("Bad");
			break;
		default:
			System.out.println("You Failed");
			break;
		}
	}
	
}
