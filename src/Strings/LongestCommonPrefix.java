package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        String s = sc.nextLine();
        String[] strs = s.split(" ");
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String res = "";
        String first = strs[0];
        String last = strs[strs.length-1];
        int n = Math.min(first.length(),last.length());
        for(int i=0;i<n;i++){
            if(first.charAt(i)==last.charAt(i)){
                res+=first.charAt(i);
            }
            else{
                return res;
            }
        }
        return res;
    }
}
