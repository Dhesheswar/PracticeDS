package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LargestOddNumber {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        String s = sc.nextLine();
        //String str = String.valueOf(Integer.parseInt(s));
        // removing trainling zeros
        int j = 0;
        while(j<s.length()-1 && s.charAt(j) == '0'){
            j++;
        }
        String str = s.substring(j,s.length());
        String result="";
        // printing largest od number
        for(int i = str.length()-1;i>=0;i--){
            if(((str.charAt(i)-'0') & 1) ==1){
                result = str.substring(0,i+1);
                break;
            }
        }
        System.out.println(result);
    }
}

