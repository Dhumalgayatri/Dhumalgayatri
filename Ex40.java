//40.Write a program in JAVA to print the area and perimeter of a rectangle.   
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        
        float height, width, area, perimeter;

        System.out.println("Print the area and perimeter of reactangle:");
        System.out.println("---------------------------------------------");
        Scanner in = new Scanner(System.in);
        System.out.print("Input height of rectangle: ");
        height = in.nextFloat();
        
        System.out.print("Input width of rectangle: ");
        width  = in.nextFloat();  
        
        perimeter = 2 * (height + width);
        area = height* width;
        
        System.out.println("Perimeter of rectangle is " + perimeter + " units.");
        System.out.println("Area of rectangle is " + area + " sq. units.");
    }
}



//OUTPUT
//Print the area and perimeter of reactangle:
//---------------------------------------------
//Input height of rectangle: 5.6
//Input width of rectangle: 8.5
//Perimeter of rectangle is 28.2 units.
//Area of rectangle is 47.6 sq. units.

//[Program finished]
