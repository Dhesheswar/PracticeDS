package ProbOnArrays.Medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.lang.*;

// find the number while is more than n/2 times
public class MajorityElement1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int resultBetter = findMarjorityElementBetter(arr,n);
        System.out.println(resultBetter);
        //findMarjorityElementOptimal(arr,n);
    }
    public static int findMarjorityElementBetter(int[] arr, int n){
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }
            else{
                hmap.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}

//7
//        2 2 3 3 1 2 2
