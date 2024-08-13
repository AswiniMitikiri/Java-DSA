public class Nth_fibanacci_Recursion {

    public static int fib_Num(int n){
        if(n==0 || n==1){
            return n;
        }
        // int fibm1 = fib_Num(n-1);
        // int fibm2 = fib_Num(n-2);
        // int fib = fibm1 + fibm2;
        int fib = fib_Num(n-1) + fib_Num(n-2);
        return fib;
    }
    public static void main(String[] args){
        int n = 10;   //10th term in the series
        System.out.print(fib_Num(n));
    }
}
