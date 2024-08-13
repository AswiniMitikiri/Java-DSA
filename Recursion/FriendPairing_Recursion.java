public class FriendPairing_Recursion {

    public static int friendsPairing(int n){
        //base case
        if(n == 1 || n == 2){
            return n;
        }
        // //choice single
        // int fnm1 = friendsPairing(n-1);

        // //choice pair
        // int fnm2 = friendsPairing(n-2);

        // int pairways = (n-1) * fnm2;

        // //totalways
        // int totways = fnm1 + fnm2;
        // return totways;

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
