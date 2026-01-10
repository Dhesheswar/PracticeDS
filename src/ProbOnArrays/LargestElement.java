package ProbOnArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = 0;
        for(int i= 0 ;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
