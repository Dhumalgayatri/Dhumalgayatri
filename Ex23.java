//23.Write a program in JAVA that converts kilometers per hour to miles per hour.   
import java.util.Scanner;
class Conversion
{
    public static void main(String args[])
    {
  
    Double miph,kmph;
    int dis;
	System.out.println( "Convert kilometers per hour to miles per hour");
	System.out.println ("----------------------------------------------------");
Scanner sc=new Scanner(System.in);	
System.out.println("Input the distance in kilometer:");
    dis=sc.nextInt();
    kmph=sc.nextDouble();
	miph = (kmph * 0.6213712); 
    System.out.println("The "+ kmph +" Km./hr. means "+ miph +" Miles/hr.");
    
}
}

 //OUTPUT
 //Convert kilometers per hour to miles per hour
//----------------------------------------------------
//Input the distance in kilometer:25 
//The 25 Km./hr. means 15.5343 Miles/hr. 

//[Program finished]