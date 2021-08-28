//JAVA program to swap two numbers



import java.util.*;
public class Main {
	public static void main(String[] args) {
		int x,y,t; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x :");
			x=sc.nextInt();
				System.out.println("Enter the value of y :");
		y=sc.nextInt();
		System.out.println("before swapping numbers:"+x+" "+y);
		/*swapping*/
		t=x;
		x=y;
		y=t;
		System.out.println("After swapping:"+x+" "+y);
		System.out.println();
	}
}	
