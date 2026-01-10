package ProbOnArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = 0, secondLargest = -1;
        for(int i=0;i<n;i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println("Largest : "+largest+" | "+"Second Largest : "+secondLargest);
    }
}
//9
//3 1 2 4 1 5 2 6 4
