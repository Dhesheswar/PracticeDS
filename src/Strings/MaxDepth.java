package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class MaxDepth {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        String str = sc.nextLine();
        int result = getMaxDepth(str);
        System.out.println(result);
    }
    public static int getMaxDepth(String str){
        Stack<Character> stack = new Stack<>();
        int maxDepth = 0,counter = 0;
        char[] arr = str.toCharArray();
        for(Character c: arr){
            if(c.equals('(')){
                stack.push('(');
                counter++;
                maxDepth = Math.max(counter,maxDepth);
            }
            else if (c.equals(')')) {
                if (!stack.empty()) {
                    counter--;
                    stack.pop();
                }
            }
            //System.out.print(c+" ");
        }
        return maxDepth;
    }
}
