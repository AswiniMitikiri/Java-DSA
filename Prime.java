import java.util.*;

public class Prime {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        

        if(n == 0){
            System.out.println(n + " is prime");
        } else {
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(n); i++) {  /*more optimised way of running loop and optimized time complexity by
                running the loop till sqrt of n times instead of (n-2) times*/
                if(n % i == 0) {      // n is a multiple of i (i not equal to 1 or n )
                    isPrime = false;
                }
            }
    
            if(isPrime == true) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        }

        //Practice Questions

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i += 2;
        }

        //output = 2 times Hello world as the i++ and i+ = 2 increments 'i' 3 times

        //Print sum of even and odd integers
        int num = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        for(int j=1; j <= num; j++){
            int input = sc.nextInt();
            if(input % 2 == 0){
                evensum = evensum + input;
            } else {
                oddsum = oddsum + input;
            }
        }
        System.out.println("evensum is: " + evensum);
        System.out.println("oddsum is: " + oddsum);

        //Factorial of any number entered by the user
        int userInput = sc.nextInt();
        int fact = 1;
        for (int k = userInput; k >= 1; k-- ){
            
            fact = fact * k;
        }
        System.out.println("Factorial of " + userInput + ": " + fact);
        

        // Multiplication table of a number N
        System.out.println("Multiplication Table");
        int user_Input_2 = sc.nextInt();
        for(int a = 1; a <= 10; a++){
            System.out.println(user_Input_2 + " * " + a + " = " + (user_Input_2*a));
        }
    }
    
}
