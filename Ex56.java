//56. Write a program in JAVA to show the manipulation of a string.   
import java.util.*;
class StringManipulation {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		System.out.println("Show the manipulation of a string:");
		System.out.println("-------------------------------------"); 
   String str="welcome, w3resource";
   String[] strAr={"w","e","l","c","o","m","e","w","3","r","e","s","o","u","r","c","e"};
   System.out.println("The string:: "+str);
   System.out.println("The length of the string:"+str.length());  
   System.out.println("The char at index 1 of the string:"+ str.charAt(1) );     
   System.out.println("The char at index 1 of the string [using array ]::"+strAr[1]);        
   System.out.println("Is the string empty:"+ str.isEmpty());   
   System.out.println("Retrieve the sub-string from 3rd position for 4 characters::"+str.substring(3,str.length()-12)); 
   System.out.println("The sub-string replace by 'went'::"+(str=str.replace("come", "went"))); 
   System.out.println("Append a string 'end' at last of the string::"+(str=str.concat(" end")));  
   System.out.println("Append a string 'end' at last of the string using operator::"+(str=str+ " end"));  
  String str1;
   str1 = str;   
   System.out.println("The new string is::"+str1);
 
   System.out.println("Input a sentence::");
   str=sc.nextLine(); 
   System.out.println(str);;
}
}

//OUTPUT
//Show the manipulation of a string:
//-------------------------------------
//The string:: welcome, w3resource
//The length of the string:19
//The char at index 1 of the string:e
//The char at index 1 of the string [using array ]::e
//Is the string empty:false
//Retrieve the sub-string from 3rd position for 4 characters::come
//The sub-string replace by '//went'::welwent, w3resource
//Append a string 'end' at last of the string::welwent, w3resource end
//Append a string 'end' at last of the string using operator::welwent, w3resource end end
//The new string is::welwent, w3resource end end
//Input a sentence::
// The quick brown fox jumps over the lazy dog.^KThe quick brown fox jumps over the lazy dog
// The quick brown fox jumps over the lazy dog.
//                                             The quick brown fox jumps over the lazy dog

//[Program finished]