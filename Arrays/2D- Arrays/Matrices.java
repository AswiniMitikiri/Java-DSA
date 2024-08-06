import java.util.*;
public class Matrices{

    public static boolean search(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                //largest = Math.max(largest, matrix[i][j]);
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("The largest element in the matrix: " + largest);
        
    }

    public static void smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        //System.out.println(smallest);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        System.out.println("The smallest element in the matrix: " + smallest);
        
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n=3 , m=3;
        // int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);
        largest(matrix);
        smallest(matrix);

    }
}