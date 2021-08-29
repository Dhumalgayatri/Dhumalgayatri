//68.Write a JAVA program to read seven numbers and sorts them in descending order.

import java.util.Scanner;
public class SortInDescendingOrder {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = 7;
        int arr[] = new int[n];
        
        System.out.println("Enter the seven numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            } 
        }
        
        System.out.println("Sorted in descending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//OUTPUT
//Enter the seven numbers:
//7
//6
//4
//3
//4
//5
//2
//Sorted in descending order:
//7 6 5 4 4 3 2
//[Program finished]