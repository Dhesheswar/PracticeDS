package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        String str = sc.nextLine();
        char[] strArray = str.toCharArray();
        int result = convertRomanToInteger(strArray);
        System.out.println(result);
    }

    public static int convertRomanToInteger(char[] strArray){
        int res = 0;
        for(char c:strArray){
            switch(c){
                case 'I' -> res+=1;
                case 'V' -> res+=5;
                case 'X' -> res+=10;
                case 'L' -> res+=50;
                case 'C' -> res+=100;
                case 'D' -> res+=500;
                case 'M' -> res+=1000;
            }
        }
        return res;
    }
}
