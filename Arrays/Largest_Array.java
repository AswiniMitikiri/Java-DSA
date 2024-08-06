

public class Largest_Array {
    public static int largestArray(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;

        //Time complexity - O(n) 
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }

            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is " + smallest);
        return largest;
    }

    public static void main(String args[]){
        int numbers[] = { 1,2,6,3,5};

        System.out.println("largest value is " + largestArray(numbers));
    }
}
