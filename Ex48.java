//48.Write a program in JAVA which swap the values of two variables not using third variable.  
 
import java.util.Scanner;
class Swap {
	public static void main(String arg[]) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Swap two numbers without using third variable:");
		System.out.println("-------------------------------------");
		System.out.print("Input 1st number:");
		num1 = sc.nextInt();
		System.out.print("Input 2nd number:");
		num2 = sc.nextInt();
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swapping the 1st number is:" + num1);
		System.out.print("After swapping the 2nd number is:" + num2);
	}
}

//OUTPUT
//Swap two numbers without using third variable:
//-------------------------------------
//Input 1st number:25
//Input 2nd number:20
//After swapping the 1st number is:20
//After swapping the 2nd number is:25
//[Program finished]