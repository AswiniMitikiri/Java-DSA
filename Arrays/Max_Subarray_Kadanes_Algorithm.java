public class Max_Subarray_Kadanes_Algorithm {  
    // KADANE's Algorithm best time complexity->O(n)
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i <numbers.length; i++){
            cs = cs + numbers[i];

            if(cs < 0){
                cs = 0;
            }
            //ms=Math.max(cs,ms)  as this Math function is not working we can take the below 
            if(cs>ms){
                ms=cs;
            }

            //write code to print smallest negative number if all the numbers are negative 
            //instead of getting output as 0.
        }
        System.out.println("Our MAX SUBARRAY SUM is: " + ms);

    }
    public static void main(String[] args){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}
