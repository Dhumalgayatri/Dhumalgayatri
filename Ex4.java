
		//Write a program in JAVA to print the sum of two numbers using variables.   
		
		
import java.util.Scanner;
public class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
   
    System.out.print("Input the first number: ");
    int num1 = input.nextInt();
    System.out.print("Input the second number: ");
    int num2 = input.nextInt();
    int sum = num1 + num2;
    System.out.println(" The sum of  "   +num1+ " and "+num2 + " is:"+ sum);
  
    
	}
}

//OUTPUT:
//Input the first number: 29
//Input the second number: 30
// The sum of  29 and 30 is:59

//[Program finished]