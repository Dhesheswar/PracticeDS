package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean result = getIsomorphicString(s,t);
        System.out.println(result);
    }

    public static boolean getIsomorphicString(String s,String t){
        HashMap<Character,Character> hmap1 = new HashMap<>();
        HashMap<Character,Character> hmap2 = new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i = 0;i<s.length();i++){
            if(hmap1.containsKey(s.charAt(i))){
                if(hmap1.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                hmap1.put(s.charAt(i),t.charAt(i));
            }
            if(hmap2.containsKey(t.charAt(i))){
                if(hmap2.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }else{
                hmap2.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
        //System.out.println(hmap);
    }
}
