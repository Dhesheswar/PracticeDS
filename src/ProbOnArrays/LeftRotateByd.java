package ProbOnArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeftRotateByd {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr, int start, int end){
        int low = start , high = end;
        while(low < high){
            swap(arr, low, high);
            low++;high--;
        }
    }

    private static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
