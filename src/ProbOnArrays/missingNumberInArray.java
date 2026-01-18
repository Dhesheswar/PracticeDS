package ProbOnArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class missingNumberInArray {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = -1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max) max = arr[i];
        }
        int resultSum = findMissingBySum(arr,max);
        int resultXor = findMissingByXor(arr,max);
        System.out.println(resultSum);
        System.out.println(resultXor);
    }

    private static int findMissingBySum(int[] arr,int max) {
        int n = max;
        int sumOfN = (n*(n+1))/2;
        int sumOfArray = 0;
        for(int i=0;i<arr.length;i++){
            sumOfArray+=arr[i];
        }
        return sumOfN-sumOfArray;
    }

    private static int findMissingByXor(int[] arr,int max) {
        int xor1=arr[0],xor2=1;
        for(int i=0;i<arr.length;i++){
            xor2 = xor2^arr[i];
            xor1 = xor1^(i+1);
        }
        xor1 = xor1^max;
        return xor1^xor2;
    }
}
