public class Factorial_Recursion {

    public static int fact(int n){

        if(n==0){
            return 1;  //0! = 1
        }
        //int fn1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public static void main(String[] args){
        int  n = 5;
        System.out.println(fact(n));
    }
}