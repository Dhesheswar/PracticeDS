package BinarySearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchRotatedArray {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = searchRotatedSortedArray(nums, n,target);
        System.out.println(result);
    }
    public static int searchRotatedSortedArray(int[] nums, int n,int target){
        int low=0,high=n-1;
        int res = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                res = mid;
            }
            // left side is sorted
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target <= nums[mid]){
                    high = mid-1;
                }
                else{
                    low= mid+1;
                }
            }
            //right side is sorted
            else{
                if(target>= nums[mid] && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return res;
    }
}
