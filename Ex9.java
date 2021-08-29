//Write a JAVA program to display the operation of pre and post increment and decrement

public class Main {
	public static void main(String[] args) {

   int num = 57;      
   System.out.println(  " Display the operation of pre and post increment and decrement :");
	System.out.println( "--------------------------------------------------------------------");    
   System.out.println(" The number is : " + num ); 
   num++;               // increase by 1 (post-increment)
   System.out.println(" After post increment by 1 the number is : " + num ); 
   ++num;               // increase by 1 (pre-increment)
   System.out.println(" After pre increment by 1 the number is : " + num ); 
   num = num + 1;  // num is no{w increased by 1.
   System.out.println(" After increasing by 1 the number is : " + num ); // 79
   num--;               // decrease by 1 (post-decrement)
   System.out.println(" After post decrement by 1 the number is : " + num ); 
   --num;               // decrease by 1 (pre-decrement)
   System.out.println(" After pre decrement by 1 the number is : "+ num );
   num = num - 1; // num is now decreased by 1.
   System.out.println(" After decreasing by 1 the number is : " +num);
}

	
}

//OUTPUT
//Display the operation of pre and post increment and decrement :
//--------------------------------------------------------------------
 //The number is : 57
 //After post increment by 1 the n//umber is : 58
 //After pre increment by 1 the number is : 59
 //After increasing by 1 the number is : 60
 //After post decrement by 1 the number is : 59
 //After pre decrement by 1 the number is : 58
 //After decreasing by 1 the number is : 57

//[Program finished]