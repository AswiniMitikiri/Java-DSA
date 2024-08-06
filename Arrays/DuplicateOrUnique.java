import java.util.*;
public class DuplicateOrUnique {
    public static boolean Duplicates(int numbers[]){
        int n = numbers.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
                else{
                    
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // int numbers[] = {1,2,3,4,1,2,7};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println(Duplicates(numbers));
        sc.close();
    }
    
}
