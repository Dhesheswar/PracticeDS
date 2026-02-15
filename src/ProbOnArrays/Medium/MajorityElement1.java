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
        int resultOptimal = findMarjorityElementOptimal(arr,n);
        System.out.println(resultBetter);
    }
    // moore's voting algorithm
    public static int findMarjorityElementOptimal(int[] arr, int n){
        int majELement = 0;
        int count = 0;
        for(int i= 0 ;i<n;i++){
            if(count == 0){
                count=1;
                majELement = arr[i];
            }else if(arr[i] == majELement){
                count++;
            }else{
                count--;
            }
        }
        return majELement;
        // kindly find the count of number when majority element may or may not present
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
