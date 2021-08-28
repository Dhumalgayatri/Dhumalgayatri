//JAVA program to calculate volume of sphere//




import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.println("Calculate the volume of Sphere:");
		System.out.println("---------------------------------------------------------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the radius of sphere:");
		double r=sc.nextDouble();
	Double volume=(4*22*r*r*r)/(3*7);
	System.out.println("Volume is:"+volume);
	
	}
}