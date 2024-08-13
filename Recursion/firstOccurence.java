public class firstOccurence {

    public static int first_Occurence(int arr[], int key, int i){

        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return first_Occurence(arr,key,i+1);
    }

    public static void main(String[] args){
         int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
         System.out.println(first_Occurence(arr, 5, 0));
    }
}