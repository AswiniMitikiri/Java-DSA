public class Sum_n_Recursion {

    public static int printN_Sum(int n ){
        if(n == 1){
            return 1;
        }

        int sum = n + printN_Sum(n-1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(printN_Sum(n));
    }
}