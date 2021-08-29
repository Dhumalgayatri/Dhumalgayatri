//71.Write a JAVA program which reads a sequence of integers and prints mode values of the sequence. The number of integers is greater than or equals to 1 and less than or equals to 100.   Note: The mode of a set of data values is the value that appears most often. 
    
import java.util.Scanner;
 public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cnt[] = new int[100];
		int i;
        System.out.println("How many integers would you like to input(Max.100?)");
		int x = input.nextInt();
        System.out.println("Input the integers:");
        for (i = 0; i <x; i++){ 
         int n = input.nextInt();
            cnt[--n]++;	
		}
		 
        int max = 0;
        for (int n : cnt){
            if (max < n){
                max = n;
            }
        }
         System.out.println("Mode value(s)in ascending order:");
        for (i = 0; i < cnt.length; i++){
            if (cnt[i] == max){
                System.out.println(i + 1);
            }
        }
    }
 }
        
        //OUTPUT
        //How many integers would you like to input(Max.100?)
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63v64 65 66 67 68 69 70 71 73 72 74 75 76 77 78 79 80 81 82v83 94 84 85 87 88 89 80 91 92 93 94 95 95
//Input the integers:
//Mode value(s)in ascending order:2

//[Program finished]