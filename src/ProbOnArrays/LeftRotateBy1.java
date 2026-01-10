package ProbOnArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeftRotateBy1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for(int i = 1; i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
//7
//3 2 1 7 6 5 4
