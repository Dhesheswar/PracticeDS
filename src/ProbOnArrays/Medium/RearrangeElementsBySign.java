package ProbOnArrays.Medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RearrangeElementsBySign {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int[] temp = nums.clone();
        int[] resultOptimal = rearrangeElementsBySignOptimal1(nums,n);
        for(int i=0;i<n;i++){
            System.out.print(resultOptimal[i]+" | ");
        }
        System.out.println();
        rearrangeElementsBySignBrute(nums,n);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
//        rearrangeElementsBySignOptimal2(temp,n);
//        for(int i=0;i<n;i++){
//            System.out.print(temp[i]+" ");
//        }
    }
    // return when positives equals negative
    public static int[] rearrangeElementsBySignOptimal1(int[] nums,int n){
        int indPositive = 0,indNegative = 1;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] > 0 && indPositive < n){
                temp[indPositive] = nums[i];
                indPositive+=2;
            }
            else if(nums[i] < 0 && indNegative < n){
                temp[indNegative] = nums[i];
                indNegative+=2;
            }
        }
        return temp;
    }
    // return when positives not equals negative
    public static void rearrangeElementsBySignOptimal2(int[] nums, int n){
        int[] positiveArray = new int[n/2];
        int[] negativeArray = new int[n/2];
        int indPos = 0 , indNeg = 0;
        for(int i=0;i<n;i++){
            if(nums[i] >= 0){
                positiveArray[indPos++] = nums[i];
            }else{
                negativeArray[indNeg++] = nums[i];
            }
        }
        indPos = 0 ; indNeg = 0;
        if(positiveArray.length > negativeArray.length){
            for(int i = 0;i<negativeArray.length;i++){
                nums[2*i] = positiveArray[indPos++];
                nums[2*i+1] = negativeArray[indNeg++];
            }
            int ind = indNeg * 2;
            for(int i=negativeArray.length;i<n;i++){
                nums[indNeg++] = positiveArray[indPos++];
            }
        }else{
            for(int i = 0;i<positiveArray.length;i++){
                nums[2*i] = negativeArray[indPos++];
                nums[2*i+1] = positiveArray[indNeg++];
            }
            int ind = indPos * 2;
            for(int i=positiveArray.length;i<n;i++){
                nums[indPos++] = negativeArray[indNeg++];
            }
        }
    }
    // brute force solution
    public static void rearrangeElementsBySignBrute(int[] nums, int n){
        int[] positiveArray = new int[n/2];
        int[] negativeArray = new int[n/2];
        int indPos = 0 , indNeg = 0;
        for(int i=0;i<n;i++){
            if(nums[i] >= 0){
                positiveArray[indPos++] = nums[i];
            }else{
                negativeArray[indNeg++] = nums[i];
            }
        }
        indPos = 0 ; indNeg = 0;
        for(int i = 0;i<n/2;i++){
            nums[2*i] = positiveArray[indPos++];
            nums[2*i+1] = negativeArray[indNeg++];
        }
    }
}
