//Write a program in JAVA to calculate the volume of a cube.

import java.util.Scanner;
class VolumeOfCube {
	public static void main(String args[]) {
		double side,volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate the volume of a cube:");
		System.out.println("-------------------------------------");
		System.out.print("Input the side of a cube:");
		side = sc.nextDouble();
	    volume = side * side * side;
		System.out.println("The Volume of a Cube is:" + volume);
	}
}




//OUTPUT
//Calculate the volume of a cube:
//-------------------------------------
//Input the side of a cube:5
//The Volume of a Cube is:125.0

//[Program finished]