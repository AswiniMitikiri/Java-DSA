public class Optimised_Power_Recursion {
    public static int optimizedPower(int x, int n){
        if( n == 0){
            return 1;
        }

        //int halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);  
        //still O(n), as the function runs same number of times in both function calls here

        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        // now O(log n)

        // n is odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 5));
    }
}