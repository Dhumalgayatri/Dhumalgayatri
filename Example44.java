	/*44. Write a language program to get the volume of a sphere with radius 6.   
Sample Output:
Calculate the volume of a sphere :
---------------------------------------
Input the radius of a sphere : 6
The volume of a sphere is : 523.333
*/

public class sphere{  
        public static void main(String args[])  
    {  
    System.out.println("Calculate the volume of a sphere :");
    System.out.println("-------------------\n");
    System.out.println("Input the radius of a sphere:");
    int radius=6;  
    double pie=3.14285714286;  
    double volume=(4.0/3.0)/(radius*radius*radius);
    System.out.println("The Volume of  sphere is="+volume);  
     }  
}
