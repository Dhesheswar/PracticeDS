package ProbOnArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
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
        System.out.println("Enter 1 to rotate left and 2 to rotate right");
        int r = sc.nextInt();
        if(r == 1) {
            reverseArray(arr, 0, d - 1);
            reverseArray(arr, d, n - 1);
            reverseArray(arr, 0, n - 1);
        }
        else if(r==2) {
            reverseArray(arr, 0, n - 1);
            reverseArray(arr, 0, d - 1);
            reverseArray(arr, d, n - 1);
        }
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

//7
//3 2 1 7 6 5 4
//3
//2
