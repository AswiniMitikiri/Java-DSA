public class Diagonal_Sum {

    public static int diagonalSum(int matrix[][]){   // BruteForce Approach -> Time complexity -> O(n^2)
        int sum = 0;
        // for(int i =0; i <= matrix.length-1; i++){
        //     for(int j = 0; j <= matrix[0].length-1; j++){
        //         if(i == j){
                    
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        //optimized code => time complexity = linear time = O(n)
        for(int i=0; i< matrix.length;i++){
            //Primary Diagonal
            sum += matrix[i][i];

            //Secondary Diagonal
            // i+j = n-1 => j = n-1-i
    
            if(i != matrix.length-1-i)  //since in odd matrix, diagonal should not be added twice
                sum += matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        System.out.print(diagonalSum(matrix));
    }
    
}
