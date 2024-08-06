public class Max_Subarray_Sum {  //Brute Force Approach -  basic Approach and Time Complexity - O(n^3)
    public static void Max_Sub_array_Sum(int numbers[]){
        int Max_Sum = Integer.MIN_VALUE , Current_Sum = 0;
        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i ; j < numbers.length; j++){
                int end = j;
                Current_Sum = 0;
                for(int k = start; k <= end; k++){  //print
                    // System.out.print(numbers[k] + " ");  //subarray
                    Current_Sum +=  numbers[k];  // Sum of Subarray
                }
                System.out.println("Current Sum: " + Current_Sum);
                if(Max_Sum < Current_Sum){
                    Max_Sum = Current_Sum;
                }
            }
        }
        System.out.println("Maximum of SubArrays: " + Max_Sum);
    }

    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        Max_Sub_array_Sum(numbers);
    }
}
