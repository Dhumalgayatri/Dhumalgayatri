//44.Write a language program to get the volume of a sphere with radius 6.   
import java.util.Scanner;
class Sphere {
	public static void main(String args[]) {
		int rad;
		double volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate the volume of a sphere :");
		System.out.println("-------------------------------------");
		System.out.print("Input the radius of a sphere:");
		rad = sc.nextInt();
		volume = (4 * 3.14 * rad * rad * rad) / 3;
		System.out.println("The volume of a sphere is:" + volume);
	}
}
//OUTPUT
//Calculate the volume of a sphere :
//-------------------------------------
//Input the radius of a sphere:5
//The volume of a sphere is:523.3333333333334

//[Program finished]