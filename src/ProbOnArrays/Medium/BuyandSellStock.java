package ProbOnArrays.Medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuyandSellStock {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int result = finMaximumProfit(nums,n);
        System.out.println(result);
    }
    // remember the minimum through out the array
    public static int finMaximumProfit(int[] nums,int n){
        int maxProfit = 0;
        int min = nums[0];
        int cost;
        for(int i=1;i<n;i++){
            cost = nums[i]-min;
            if(cost > maxProfit) maxProfit = cost;
            if(nums[i] < min) min = nums[i];
        }
        return maxProfit;
    }
}

//6
//        7 1 5 3 6 4
