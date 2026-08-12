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
        int len = strArray.length;
        for(int i = 0;i <len;i++){
            if (strArray[i] == 'I') {
                if((i+1) < len && strArray[i+1] == 'V'){
                    res+=4;
                    i+=1;
                }else if((i+1) < len && strArray[i+1] == 'X'){
                    res+=9;
                    i+=1;
                }else{
                    res += 1;
                }
            } else if (strArray[i] == 'V') {
                res += 5;
            } else if (strArray[i] == 'X') {
                if((i+1) < len && strArray[i+1] == 'L'){
                    res+=40;
                    i+=1;
                }else if((i+1) < len && strArray[i+1] == 'C'){
                    res+=90;
                    i+=1;
                }else{
                    res += 10;
                }
            } else if (strArray[i] == 'L') {
                res += 50;
            } else if (strArray[i] == 'C') {
                if((i+1) < len && strArray[i+1] == 'D'){
                    res+=400;
                    i+=1;
                }else if((i+1) < len && strArray[i+1] == 'M'){
                    res+=900;
                    i+=1;
                }else{
                    res += 100;
                }
            } else if (strArray[i] == 'D') {
                res += 500;
            } else if (strArray[i] == 'M') {
                res += 1000;
            }
        }
        return res;
    }
}
