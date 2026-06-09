package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        String s = sc.nextLine();
        String[] str = s.trim().split("\\s+");
        printReverseString(s);
        str = reverseTheString(str);
        for(String i : str){
            System.out.print(i+" ");
        }
    }
    // brute force
    public static String[] reverseTheString(String[] stringArray){
        int left = 0;
        int right = stringArray.length-1;
        while(left<right){
            String temp = stringArray[left];
            stringArray[left] = stringArray[right];
            stringArray[right] = temp;
            left++;right--;
        }
        return stringArray;
    }
    // optimal approach
    public static void printReverseString(String s){
        int i = s.length()-1;
        int end;
        StringBuilder result = new StringBuilder();
        while(i>=0){
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            if(i<0) break;
            end = i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            String tempWord = s.substring(i+1,end+1);
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(tempWord);
            //result.append(" ");
        }
        System.out.println(result.toString());
    }
}
