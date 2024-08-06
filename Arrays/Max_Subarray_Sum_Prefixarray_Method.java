public class Max_Subarray_Sum_Prefixarray_Method{  //prefixArray method - Time Complexity - O(n^2)
    public static void Max_Sub_array_Sum(int numbers[]){
        int Max_Sum = Integer.MIN_VALUE ;
        int Current_Sum = 0;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        //calculate Prefix Sum
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i ; j < numbers.length; j++){
                int end = j;
                Current_Sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
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
