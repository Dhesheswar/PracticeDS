package ProbOnArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ElementAppearOnce {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        ElementAppearOnce obj = new ElementAppearOnce();
        int result = obj.findElementAppearOnce(nums);
        System.out.println(result);
    }
    public int  findElementAppearOnce(int[] nums){
        int find = nums[0];
        for(int i = 1;i<nums.length;i++){
            find = find ^ nums[i];
        }
        return find;
    }

}
