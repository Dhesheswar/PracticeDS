package Sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int low=0,high=n-1;
        mergeSort(arr, low , high);
        for(int i = 0; i< n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if ( low >= high) {
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr, low , mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low , mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int fp = low, sp= mid+1;
        int ind = 0;
        int[] temp = new int[high-low+1];
        while (fp <= mid && sp <=high){
            if (arr[fp] <= arr[sp]){
                temp[ind++] = arr[fp++];
            }
            else{
                temp[ind++] = arr[sp++];
            }
        }
        while(fp <= mid){
            temp[ind++] = arr[fp++];
        }
        while(sp <= high){
            temp[ind++] = arr[sp++];
        }
        for(int i= 0;i< temp.length;i++){
            arr[low+i] = temp [i];
        }
    }
}
