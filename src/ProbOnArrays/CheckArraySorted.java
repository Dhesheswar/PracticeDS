package ProbOnArrays;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class CheckArraySorted {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]) System.out.println("Not sorted");
            return;
        }
        System.out.println("Sorted");
    }
}
