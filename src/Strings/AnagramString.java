package Strings;

import Sorting.MergeSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AnagramString {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        String s = sc.nextLine();
        String t = sc.nextLine();
        AnagramString n = new AnagramString();
        boolean result = n.isAnagram(s,t);
        System.out.println(result);

    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        s=s.toUpperCase();
        t=t.toUpperCase();
        int[] freqArray = new int[26]; // initialized to 0
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            freqArray[c1-'A']++;
            char c2 = t.charAt(i);
            freqArray[c2-'A']--;
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(freqArray[c-'A']!=0){
                return false;
            }
        }
        return true;
    }
}
