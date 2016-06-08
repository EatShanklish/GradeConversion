package com.Shanklish.GradeConversion;
import java.util.Scanner;

public class GradeConversion {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String choice ="";
		
		do {
		
			System.out.println("Please enter your numerical grade");
			int grade = scan.nextInt();
			
			String garbage = scan.nextLine();
			
			//Multitude of if statements corresponding numerical grades to letter grades
			
			if(grade <= 60 )
				System.out.println("Your letter grade is an F");
			
			else if(grade <= 62 )
				System.out.println("Your letter grade is a D-");
			
			else if( grade <= 66 )
				System.out.println("Your letter grade is a D");
			
			else if(grade <= 69 )
				System.out.println("Your letter grade is a D+");
			
			else if(grade <=72)
				System.out.println("Your letter grade is a C-");
			
			else if(grade <=76)
				System.out.println("Your letter grade is a C");
			
			else if(grade <=79)
				System.out.println("Your letter grade is a C+");
			
			else if(grade <=82)
				System.out.println("Your letter grade is a B-");
			
			else if( grade <=86)
				System.out.println("Your letter grade is a B");
			
			else if( grade <=89)
				System.out.println("Your letter grade is a B+");
			
			else if( grade <=93)
				System.out.println("Your letter grade is a A-");
			
			else if( grade <=97)
				System.out.println("Your letter grade is a A");
			
			else if (grade <= 100)
				System.out.println("Your letter grade is an A+");
			
			
			System.out.println("Would you like to enter another grade? (y/n)");
			choice = scan.nextLine();
		
		} while (choice.equalsIgnoreCase("y"));

	}

}
