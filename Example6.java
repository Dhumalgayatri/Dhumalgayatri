//6*.Write a JAVA program to to calculate the volume of cylinder//


import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Double radius,height,volume;
	Scanner sc=new Scanner(System.in);
	System.out.println("Calculate the volume of cylinder");
	System.out.println("----------------------------------------------------------");
	System.out.println("Input the radius of cylinder:");
   radius=sc.nextDouble();
   System.out.println("input rhe height of the cylinder:");
   height=sc.nextDouble();
   volume=((22*radius*radius*height)/7);       System.out.println("Volume of cylinder is:"+volume);
   	
	}
}

//OUTPUT:
//Calculate the volume of cylinder:
//------------------------------------------------------------------------//
//Input the radius of cylinder:6
//Input the height of of cylinder:8

//The volume of cylinder is:904.32