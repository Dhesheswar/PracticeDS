package Sorting;
// changed in github
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuickSort {
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
            while(i<=high && arr[i]<=arr[pivot]) {
                i++;
            }
            while(j>=low && arr[j]>arr[pivot]){
                j--;
            }
            if(i<j) swap(arr,i,j);
        }
        swap(arr,pivot,j);
        partition = j;
        return partition;
    }

    private static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
