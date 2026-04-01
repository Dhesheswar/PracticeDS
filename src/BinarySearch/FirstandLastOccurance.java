package BinarySearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstandLastOccurance {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = new int[2];
        res = findFirstandLast(nums, n, target);
        System.out.println("first occ : "+res[0]+" "+"last occ : "+res[1]);
        System.out.println("Count of occurance : "+ countOccurance(res[0],res[1]));

    }
    public static int[] findFirstandLast(int[] nums, int n,int target){
        int first = findFirst(nums, n, target);
        if(first == -1) return new int[]{-1,-1};
        else return new int[]{first, findLast(nums,n,target)};
    }
    public static int findFirst(int[] nums, int n,int target){
        int low=0,high=n-1;
        int res = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                res = mid;
                high = mid-1;
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return res;
    }
    public static int findLast(int[] nums, int n,int target){
        int low=0,high=n-1;
        int res = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                res = mid;
                low = mid+1;
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return res;
    }
    public static int countOccurance(int first,int last){
        return (first==-1) ? -1: last - first;
    }
}
