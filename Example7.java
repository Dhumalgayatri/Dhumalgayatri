
//7*.Write a JAVA program to find the area and perimeter of Reactangle//

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int lenght,width,area,perimeter;
	System.out.println("Find the area and perimeter of reactangle");
	System.out.println("---------------------------------------------");
	System.out.println("Input the lenght of the reactangle:");
	lenght=sc.nextInt();
	System.out.println("Input the width of the reactangle:");
	width=sc.nextInt();
	area=lenght*width;
	perimeter=(2*(lenght+width));
		System.out.println("Area of reactangle is:"+area);
		System.out.println("Perimeter of reactangle is:"+perimeter);				}
}

//OUTPUT:
//Find the area and perimeter of reactangle:
//------------------------------------------------------------------
//Input the lenght of the reactangl:10
//Input the wid5h of reactangle:15
//The area of reactangle=150.0
//the perimeter of reactangke=50