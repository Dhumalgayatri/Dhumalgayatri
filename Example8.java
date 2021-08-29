
//8*.Write a program in JAVA to find thw area of any triangle using heroins formula//


import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		double s1, s2, s3, area, S;
        Scanner scanner;
     scanner = new Scanner(System.in);
     System.out.println("Input  1st Side of a Triangle:");
        s1=scanner.nextDouble();
        
        System.out.println("Input  2nd Side of a Triangle:");
        s2=scanner.nextDouble();
        
        System.out.println("Input  3rd Side of a Triangle:");
        s3 = scanner.nextDouble();
        
        S = (s1 + s2 + s3) / 2;
        
        area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));
 
        System.out.format("The Area of triangle = %.2f\n", area);
   	}
}

//OUTPUT:
//Input  1st Side of a Triangle:
//5
//Input  2nd Side of a Triangle:
//5
//Input  3rd Side of a Triangle:
//5
//The Area of triangle = 10.83

//[Program finished]