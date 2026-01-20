package Random;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(isPalindrome(-121));
    }
    static int reverse(int x) {
        int res = 0;
        int temp = x;
        while(temp!=0){
            int ld = temp%10;
            if(res < Integer.MIN_VALUE/10 || res > Integer.MAX_VALUE/10){
                return 0;
            }
            res = (res*10)+ ld;
            temp=temp/10;
        }
        return res;
    }
    static boolean isPalindrome(int x) {
        int rev = reverse(x);
        while(x!=0){
            if(rev%10 != x%10){
                return false;
            }
            rev/=10;
            x/=10;
        }
        return true;
    }
}
