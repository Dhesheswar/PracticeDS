package Random;

public class Fibonacci {
    public static void main(String[] args) {
        int n = fibonacci(1);
        System.out.println(n);
    }

    private static int fibonacci(int n) {
        if (n == 0) return 0;
        else if(n==1) return 1;
        //System.out.print(i+" ");
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
