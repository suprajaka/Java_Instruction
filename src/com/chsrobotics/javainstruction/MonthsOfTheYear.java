package com.chsrobotics.javainstruction;

public class MonthsOfTheYear {
	
	
	
	public static void main(String[] args)
	{
		int					month = 2; // cannot use arrays when dealing with switch statements, good to know	
		switch (month)
		{
			case 1: System.out.println("January");
			case 2: {System.out.println("February");
					break;}
			case 3: System.out.println("March");
			case 4: System.out.println("April");
			case 5: System.out.println("May");
			case 6: System.out.println("June");
			case 7: System.out.println("July");
			case 8: System.out.println("August");
			case 9: System.out.println("September");
			case 10: System.out.println("October");
			case 11: System.out.println("November");
			case 12: System.out.println("December");
		}
	}
	
}
