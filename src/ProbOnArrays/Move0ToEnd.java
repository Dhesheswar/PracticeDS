package ProbOnArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Move0ToEnd {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int firstIndex = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                firstIndex = i;
                break;
            }
        }
        if(firstIndex == -1) return;
        for(int j = firstIndex+1;j<n;j++){
            if(arr[j]!=0){
                swap(arr , firstIndex, j);
                firstIndex++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
