package ProbOnArrays.Medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class TwoSum{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean result = FindTwoSumSorted(arr,target,n);
        boolean resultSorted = FindTwoSumSorted(arr,target,n);
        System.out.println(result);
        System.out.println(resultSorted);

    }
    public static boolean FindTwoSum(int[] arr, int target, int n){
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0; i<= n;i++){
            if(hmap.containsKey(Math.abs(arr[i]-target))){
                return true;
            }
        }
        return false;

    }
    public static boolean FindTwoSumSorted(int[] arr, int target,int n){
        Arrays.sort(arr);
        int left = 0, right = n-1;
        int totalSum = 0;
        while(left<right){
            totalSum = arr[left]+arr[right];
            if(totalSum == target) {
                return true;
            }else if(totalSum < target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}
