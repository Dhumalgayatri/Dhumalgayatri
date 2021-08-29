//Write a JAVA program to find the area and circumference of circle

import java.util.Scanner;
public class AreaAndCircumOfCircle{
	public static void main(String[] args) {
	
        int radius;
        double area, circumference;
        Scanner sc = new Scanner(System.in);
		System.out.println("Find the area and circumference of circle:");
		System.out.println("---------------------------------------");	
        System.out.print("Input Radius of Circle : ");
        radius = sc.nextInt();
		
        area = 3.14*radius*radius;
        circumference = 2*3.14*radius;
		
        System.out.println(" The Area of Circle = " +area);
		
        System.out.println(" The Circumference of Circle = " +circumference);
	}
}
//OUTPUT
//Find the area and circumference of circle:
//---------------------------------------
//Input Radius of Circle : 5
// The Area of Circle = 78.5
// The Circumference of Circle = 31.400000000000002

//[Program finished]