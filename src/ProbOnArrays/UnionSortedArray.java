package ProbOnArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UnionSortedArray {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        int i=0,j=0,index=0;
        ArrayList<Integer> unionArr = new ArrayList<>();
        while(i<n1 && j<n2){
            if(arr1[i] <= arr2[j]){
                if(unionArr.isEmpty() || unionArr.getLast()!= arr1[i]){
                    unionArr.add(arr1[i]);
                }
                i++;
            }
            else{
                if(unionArr.isEmpty() || unionArr.getLast()!= arr2[j]){
                    unionArr.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(unionArr.isEmpty() || unionArr.getLast()!= arr1[i]){
                unionArr.add(arr1[i]);
            }
            i++;
        }
        while(j<n2){
            if(unionArr.isEmpty() || unionArr.getLast()!= arr2[j]){
                unionArr.add(arr2[j]);
            }
            j++;
        }
        for(int val: unionArr){
            System.out.print(val+" ");
        }
    }
}
