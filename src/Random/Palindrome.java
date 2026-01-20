package Random;

import java.io.File;
import java.lang.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        String str = sc.nextLine();
        System.out.println(str);
        int n = str.length();
        System.out.println(isPalindrome(str,n));
        System.out.println(isPalindrome("a.",2));
        System.out.println(isPalindrome(" ",1));
        System.out.println(isPalindrome(".,",2));
        System.out.println(isPalindrome1(str));
        System.out.println(isPalindrome1("a."));
        System.out.println(isPalindrome1(" "));
        System.out.println(isPalindrome1(".,"));
    }

    private static boolean isPalindrome(String s, int n){
        int i = 0, j = n-1;
        boolean res = false;
        if(n==1) return true;
        while(i<j){
            while((i<j) && !Character.isLetter(s.charAt(i))){
                i++;
            }
            while((i<j) && !Character.isLetter(s.charAt(j))){
                j--;
            }
            if(i<j){
                res = true;
                if((Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))){
                    res = false;break;
                }
            }
            i++;j--;
        }
        return res;
    }

    private static boolean isPalindrome1(String s){
        if(s.length()==1) return true;
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int n = s.length();
        int i = 0, j = n-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
