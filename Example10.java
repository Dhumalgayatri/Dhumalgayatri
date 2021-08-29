//10*.Write a java program to convert temperature in celsius to Farenheit


import java.util.Scanner;
public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		float cel, far;

  Scanner s=new Scanner(System.in);

       System.out.println("Convert temperature in celsius to fahrenheit:");
       System.out.println("---------------------------------------");

       System.out.println("Input temperature in Celsius :");
cel=s.nextInt();

far = cel * 9/5 + 32;
       System.out.println("Temperature in Celsius: "+cel);

       System.out.println("Temperature in Farenheit:"+far);
	}
}


//OUTPUT\:
//Convert temperature in celsius to fahrenheit:
//---------------------------------------
//Input temperature in Celsius :
//35
//Temperature in Celsius: 35.0
//Temperature in Farenheit:95.0

//[Program finished]