package ProbOnArrays;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class CheckArraySorted {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int count = 0;
        boolean result = true;
        for(int i=1;i<n;i++){
            if(nums[i] < nums[i-1]){
                result = false;
                count++;
            }
        }
        if(count <= 1 && !result){
            System.out.println(true);return;
        }
        System.out.println(result);
    }
}
