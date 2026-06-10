package sings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RemoveOutermostParenthesis {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        String s = sc.nextLine();
        int counter = 0;
        String result = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                counter ++;
                if(counter>1) {
                    result += s.charAt(i);
                }
            }else if(s.charAt(i) == ')'){
                counter --;
                if(counter>0) {
                    result += s.charAt(i);
                }
            }
        }
        System.out.println(result);
    }
}
