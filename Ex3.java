//3*.Write a program in JAVA to find Size of fundamental data types.  
 
class SizePrimitiveTypes
{
  public static void main (String[] args)
  {
    System.out.println("Find the Size of Fundamental data types:");
      System.out.println("--------------------------------------------");
    System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
    System.out.println("Size of short: " + (Short.SIZE/8) + " bytes.");
    System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
    System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
     System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
    System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
   
   }
}

//OUTPUT:
//Find the Size of Fundamental data types:
//--------------------------------------------
//Size of char: 2 bytes.
//Size of short: 2 bytes.
//Size of int: 4 bytes.
//Size of long: 8 bytes.
//Size of float: 4 bytes.
//Size of double: 8 bytes.

///[Program finished]