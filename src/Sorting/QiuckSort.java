package Sorting;
// changed in github
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.util.Collections.swap;

public class QiuckSort {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int low=0,high=n-1;
        quicksort(arr, low , high); // call for quicksort
        for(int i = 0; i< n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void quicksort(int[] arr, int low, int high) {
        int partitionIndex;
        if(low<high){
            partitionIndex = findPartition(arr,low,high);
            quicksort(arr,low,partitionIndex-1);
            quicksort(arr,partitionIndex+1, high);
        }
    }

    private static int findPartition(int[] arr, int low, int high) {
        int partition;
        int i=low,j=high;
        int pivot = low;
        while(i<j){
            while(arr[i]<=arr[pivot] && i<=high){
                i++;
            }
            while(arr[j]>arr[pivot] && j>=low){
                j--;
            }
            if(i<j) swap(arr[i],arr[j]);
        }
        swap(arr[pivot],arr[j]);
        partition = j;
        return partition;
    }

    private static void swap(int i, int i1) {
        int temp = i;
        i = i1;
        i1 = temp;
    }

}
