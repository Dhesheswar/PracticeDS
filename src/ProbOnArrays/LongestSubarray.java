package ProbOnArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubarray {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int result1 = longestSubarrayBrute(nums);
        //int result2 = longestSubarrayOptimal();
        System.out.println(result1);
        //System.out.println(result2);
    }
    public static int longestSubarrayBrute(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> hmap = new HashMap<>();
        int preSum = 0;
        int maxLen = 0;
        for(int i = 0; i<n ; i++){
            preSum += arr[i];

            hmap.put(preSum,i);
        }
        return preSum;
    }
}
