//26.Write a program in JAVA to convert temperature in Fahrenheit to Kelvin.  
import java.util.Scanner;
class Convert
{
    public static void main(String args[])
    {
    	
    Double kel, far;
	System.out.println(  "Convert temperature in Fahrenheit  to Kelvin:");
		System.out.println("---------------------------------------:");
		Scanner sc=new Scanner(System.in);
    System.out.println("Input the temperature in Fahrenheit : ");
    far=sc.nextDouble();
    kel=(519*(far-32)+273.15);
    System.out.println("The temperature in Fahrenheit:" +far);
    System.out.println("The temperature in Kelvin:" +kel);
}
} 


//OUTPUT
//Convert temperature in Fahrenheit  to Kelvin:
//---------------------------------------:
//Input the temperature in Fahrenheit :80.33
//The temperature in Fahrenheit:80.33
//The temperature in Kelvin:25356.420000000002

//[Program finished]