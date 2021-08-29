//73.Write a JAVA program that accepts sales unit price and sales quantity of various items and compute total sales amount and the average sales quantity. All input values must greater than or equal to 0 and less than or equal to 1,000, and the number of pairs of sales unit and sales quantity does not exceed 100. If a fraction occurs in the average of the sales quantity, round the first decimal place.   
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

int prc,qt=2,i,n,total=0;

System.out.println("\n Enter the number of sales product: ");

n=sc.nextInt();

for(i=1;i<=n;i++)

{

System.out.println("\n\n Enter the details of the "+i+" No. product");

System.out.println("\n Enter the unit price of the sales product (between 0 to 1000): ");
      prc=sc.nextInt();

System.out.println("Enter the quantity of the sales product (between 0 t0 1000): ");

qt=sc.nextInt();

total=(total+(prc*qt));

}

for(i=1;i<=n;i++)

{

System.out.println("\n\n The details of the "+i+" No. product");

System.out.println("\n The unit price of the sales product is: ");

System.out.println("\n The quantity of the sales product is: ");

System.out.println("\n\n");

}

System.out.println("\n The total sales amount is: "+total);

}
	}

//OUTPUT
//Enter the number of sales product:3
 //Enter the details of the 1 No. product
// Enter the unit price of the sales product (between 0 to 1000):80
//Enter the quantity of the sales product (between 0 t0 1000):980
// Enter the details of the 2 No. product
 //Enter the unit price of the sales product (between 0 to 1000):60
//Enter the quantity of the sales product (between 0 t0 1000):890
// Enter the details of the 3 No. product
// Enter the unit price of the sales product (between 0 to 1000):89
//Enter the quantity of the sales product (between 0 t0 1000):670
 //The details of the 1 No. product

// The unit price of the sales product is:
 //The quantity of the sales product is:
 //The details of the 2 No. product

 //The unit price of the sales product is:

 //The quantity of the sales product is:

 //The details of the 3 No. product

 //The unit price of the sales product is:

 //The quantity of the sales product is:
// The total sales amount is: 191430

//[Program finished]