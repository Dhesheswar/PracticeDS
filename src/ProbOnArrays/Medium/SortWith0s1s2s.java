package ProbOnArrays.Medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortWith0s1s2s {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] temp = arr.clone();
        int[] resultBetter = sort012sBetter(temp,n);
        for(int i = 0;i<n;i++){
            System.out.print(resultBetter[i]+" ");
        }
        System.out.println();
        int[] resultOptimal = sort012sOptimal(arr,n);
        for(int i = 0;i<n;i++){
            System.out.print(resultOptimal[i]+" ");
        }
    }
    // Dutch national flag algorithm
    public static int[] sort012sOptimal(int[] arr,int n){
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, mid++, low++);
                //mid++;low++;
            }
            else if(arr[mid] == 2){
                swap(arr, mid,high--);
                //high--;
            }
            else{
                mid++;
            }
        }
        return arr;
    }
    // better solution for sorting
    public static int[] sort012sBetter(int[] arr,int n){
        int count0 = 0,count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) count0++;
            else if(arr[i]==1) count1++;
            else count2++;
        }
        for(int i = 0;i<count0;i++){
            arr[i] = 0;
        }
        for(int i = count0;i< count0+count1;i++){
            arr[i] = 1;
        }
        for(int i = count0+count1;i<n;i++){
            arr[i] = 2;
        }
        return arr;
    }
    //swaping the elements
    public static void swap(int[] arr,int a ,int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b]=temp;
    }
}

//11
//        0 1 1 0 1 2 1 2 0 0 0
