//31.Write a program in JAVA to input a single digit number and print a rectangular form of 4 columns and 6 rows

import java.util.Scanner;

public class RectangleStar1 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		System.out.println("Make a reactangular shape by a single digit number:");
		System.out.println("---------------------------------------------------");
		int rows, columns, i, j;
		sc = new Scanner(System.in);
		
		System.out.print(" Input Number of Rows : ");
		rows = sc.nextInt();	
		
		System.out.print(" Input  Number of Columns : ");
		columns = sc.nextInt();		
			
		for(i = 1; i <= rows; i++)
		{
			for(j = 1; j <= columns; j++)
			{
				System.out.print("4"); 
			}
			System.out.print("\n"); 
		}	
	}
}
//OUTPUT
//Make a reactangular shape by a single digit number:
//---------------------------------------------------
 //Input Number of Rows : 6
 //Input  Number of Columns : 4
//4444
//4444
//4444
//4444
//4444
//4444

//[Program finished]
