public class Pairs_in_Array {

    public static void printPairs(int numbers[]){
        int Totalpair = 0;
        for(int i = 0; i < numbers.length; i++){
            //int current = numbers[i]; //we can use this instead of directly using numbers[i] to print pairs//2, 4, 6, 8, 10
            for(int j = i+1; j < numbers.length; j++){
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
                Totalpair++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + Totalpair);
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
    
}
