//Java program to print add two numbers accept through keyboard//

import java.util.*;
public class Main {
	public static void main(String[] args) {
	int[]array={10,20,30};
	int[]b={40,50,60,70,80,90};
	int[]c=new int[array.lenght+b. lenght];
	System.out.println("Original array:");
System.out.println(Arrays.toString(array));    
	  int count=0;
	for(int i=0; i < array.lenght; i++)
	{
		c[i]=array[i];
		count++;
		}
		for(int j=0; j < b.lenght; j++)
		{
			c[count++]= b[j];
			}
			{
				System.out.println("After append value to end of the array:");
					System.out.println(Arrays.toString(c));
				
			}
	}
}