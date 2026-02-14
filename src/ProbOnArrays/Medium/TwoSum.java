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
        int[] result = FindTwoSum(arr,target,n);
        boolean resultSorted = FindTwoSumSorted(arr,target,n);
        for(int i : result) {
            System.out.println(i);
        }
        System.out.println(resultSorted);

    }
    public static int[] FindTwoSum(int[] nums, int target, int n){
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int f = target - nums[i];
            if(hmap.containsKey(f)){
                return new int[]{hmap.get(f),i};
            }
            hmap.put(nums[i],i);
        }
        return new int[]{};

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
