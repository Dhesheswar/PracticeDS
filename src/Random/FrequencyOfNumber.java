package Random;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfNumber {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }
            else{
                hmap.put(nums[i],1);
            }
        }
        for(int i : hmap.keySet()){
            System.out.print(i+" ");
        }
        for(Map.Entry<Integer,Integer> hm : hmap.entrySet()){
            System.out.print(hm.getKey()+ "-"+ hm.getValue()+"\n");
        }
    }
}
