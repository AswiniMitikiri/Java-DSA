public class Tiling_Problem_Recursion {

    public static int tilingProblem(int n){  ///2 x n (floor size)

        //base case
        if(n == 0 || n==1){
            return 1;
        }

        //function or work
        //verticle choice
        int verticleTiles = tilingProblem(n-1);

        //Horizontal choice
        int horizontalTiles = tilingProblem(n-2);

        int totalWays = verticleTiles + horizontalTiles;

        return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}