package ProbOnArrays.Medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int[] arr1 = nums.clone();
        int result = maximumSumSubarrayOptimal(nums,n);
        System.out.println(result);
        printIndexOfMaximumSumSubarrayOptimal(arr1,n);
    }
    // Kadane's maximum subarray sum algorithm
    private static int maximumSumSubarrayOptimal(int[] nums, int n) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum+=nums[i];
            if(sum > maxSum) maxSum = sum;
            if(sum<0) sum = 0;
        }
        return maxSum;
    }
    // printing the index of subarray
    private static void printIndexOfMaximumSumSubarrayOptimal(int[] nums,int n){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0,start = -1;
        int first=-1,last=-1;
        for(int i =0;i<n;i++){
            if(sum==0) start = i;
            if(sum > maxSum){
                maxSum = sum;
                first = start; last = i;
            }
            sum+=nums[i];
            if(sum<0) sum = 0;
        }
        for(int i = first;i<last;i++){
            System.out.print(nums[i]+ " ");
        }
    }
}

//8
//        -2 -3 4 -1 -2 1 5 -3
