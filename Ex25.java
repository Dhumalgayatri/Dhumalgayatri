//25*Write a program in JAVA to convert temperature in Kelvin to Celsius.   
import java.util.Scanner;
class Convert
{
    public static void main(String args[])
    {
    	
    Double kel, cel;
	System.out.println(  "Convert temperature in Kelvin to celsius:");
		System.out.println("---------------------------------------:");
		Scanner sc=new Scanner(System.in);
    System.out.println("Input the temperature in Kelvin : ");
    kel=sc.nextDouble();
    cel=(kel-273.15);
    System.out.println("The temperature in kelvin:" +kel);
    System.out.println("The temperature in celsius:" +cel);
}
} 

//OUTPUT:
//Convert temperature in Kelvin to celsius:
//---------------------------------------:
//Input the temperature in Kelvin :300
//The temperature in kelvin:300.0
//The temperature in celsius:26.850000000000023

//[Program finished]