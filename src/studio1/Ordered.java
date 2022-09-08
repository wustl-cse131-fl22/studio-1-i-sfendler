package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		boolean check =  x-y > 0; 
		boolean check2 = y - z > 0; 
		
		boolean check3 = z-y > 0; 
		boolean check4 = y-x > 0; 
		
		boolean isOrdered = (check && check2) || (check3 && check4); 
		
		System.out.println(isOrdered);
		
		
		
	}

	
}
