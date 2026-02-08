package ProbOnArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaxCount1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int result = findMaxCountOf1(nums);
        System.out.println(result);
    }
    public static int findMaxCountOf1(int[] nums){
        int maxCount = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count > maxCount) maxCount = count;
            } else if (nums[i]== 0) {
                count = 0;
            }
        }
        return maxCount;
    }
}
