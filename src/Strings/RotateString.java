package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        String s = sc.nextLine();
        String goal = sc.nextLine();
        if(s.length()!=goal.length()) {
            System.out.println("NO");return;
        }
        String str = s+s;
        int n = s.length();
        for(int i = 0;i<n;i++){
            if(str.substring(i,i+n).equals(goal)){
                System.out.println("YES");return;
            }
        }
        System.out.println("NO");
    }
}
