//46.Write a program in JAVA to calculate the volume of a cylinder. 
  
import java.util.Scanner;
class VolumeOfCylinder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate the volume of a cylinder:");
		System.out.println("-------------------------------------");
		System.out.print("Input the radius of the cylinder:");
		double r = sc.nextDouble();
		System.out.print("Input the height of the cylinder:");
		double h = sc.nextDouble();
		double  volume = ((22 * r * r * h) / 7);
		System.out.println("The volume of a Cylinder is:" + volume);
	}
}

//OUTPUT
//Calculate the volume of a cylinder:
//-------------------------------------
//Input the radius of the cylinder:4
//Input the height of the cylinder:8
//The volume of a Cylinder is:402.2857142857143

//[Program finished]