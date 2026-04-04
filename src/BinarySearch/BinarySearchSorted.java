package BinarySearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarySearchSorted {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int resultIndex = binarySearch(nums,target, 0, n-1);
        System.out.println(resultIndex);
    }
    private static int binarySearch(int[] nums, int target, int start, int end){
        if(start > end) return -1;
        int res = -1;
        int mid = (start+(end-start)/2) ;
        if (nums[mid] == target){
            return mid;
        }
        else if (target < nums[mid]){
            return binarySearch(nums, target,start, mid-1);
        }
        else{
            return binarySearch(nums, target, mid+1, end);
        }
    }
}
