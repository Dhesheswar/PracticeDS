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
        int result1 = longestSubarrayBrute(nums,k);
        int result2 = longestSubarrayOptimal(nums, k);
        System.out.println(result1);
        System.out.println(result2);
    }
    //optimal for positives
    private static int longestSubarrayOptimal(int[] arr, int k) {
        int n = arr.length;
        int left = 0 , right = 0;
        int totalSum = arr[0],maxLen = 0;
        while(right < n){
            // reducing all elements in left when sum is greater than k
            while(left <= right && totalSum > k){
                totalSum -= arr[left];
                left++;
            }
            // finding maxlen when sum equals k
            if(totalSum == k){
                maxLen = Math.max( maxLen , right - left +1);
            }
            // adding the right pointer when sum is lesser then k
            right++;
            if(right < n){
                totalSum += arr[right];
            }
        }
        return maxLen;

    }
    // optimal for positives and negatives
    public static int longestSubarrayBrute(int[] arr, int k){
        int n = arr.length;
        Map<Integer,Integer> hmap = new HashMap<>();
        int preSum = 0;
        int maxLen = 0;
        for(int i = 0; i<n ; i++){
            preSum += arr[i];
            if(preSum == k){
                maxLen = i+1;
            }
            int bal = preSum - k;
            // check for remaining value in the hashmap
            if(hmap.containsKey(bal)){
                maxLen = Math.max(maxLen,i-hmap.get(bal));
            }
            // check for negative number line 50
            if(!hmap.containsKey(preSum)){
                hmap.put(preSum,i);
            }
        }
        return maxLen;
    }
}


//10
//1 2 3 1 1 1 1 4 2 3
//3

//4
//        2 0 0 3
//        3