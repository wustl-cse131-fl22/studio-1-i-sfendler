package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		System.out.print("Enter year: ");
		int year = in.nextInt();
		
		boolean divisibleBy4 = year % 4 == 0;
		boolean notDivisibleBy100 = year % 100 != 0;
		boolean divisibleBy400 = year % 400 == 0;
		
		boolean isLeapYear = divisibleBy4 && notDivisibleBy100 || divisibleBy4 && divisibleBy400;
		
		System.out.println("is " + year + " a leap year? " + isLeapYear);
	}

}
