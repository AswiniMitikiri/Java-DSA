import java.util.*;
public class Loops {
    public static void main(String args[]) {

        //While Loop
        int count = 1;
        while(count <= 100) {
            System.out.println("Hello world " + count);
            count++ ;
        }

        //Print numbers from 1 to n and sum of the first n natural numbers
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        int sum = 0;

        while(counter <= range) {
            System.out.println(counter);
            sum = sum + counter;
            counter++;
           
        }

        System.out.println("Sum of n numbers: " + sum);

        // For Loop
        //print "hello world" using for loop
        for(int i = 1; i <=10; i++){
            System.out.println("Hello World " + i);
        }

        //Print a square pattern
        // ****
        // ****
        // ****
        // ****

        for(int line = 1;line <= 4; line++) {
            System.out.println("Print a Square pattern");
            System.out.println("****");
        }

        // int line = 1;
        // while(line <= 4) {
        //     System.out.println("****");
        //     line++;
        // }

        //Print Reverse of a number - 10899 -> 99801
        int n = 10899;
        while( n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
        System.out.println();

        // Reverse the given number
        int num = 29072003;
        int rev = 0;
        System.out.println("Number: " + num);
        while(num > 0) {
            int last_digit = num % 10;
            rev = ( rev * 10) + last_digit;
            num = num / 10;
        }
        System.out.println("Reverse of a number: " + rev);

        // do-while loop
        int counting = 1;
        do {
            System.out.println("Hello World using do-while loop");
            counting++;
        } while(counting <= 10);

        // Break Statement
        for(int j = 1; j <= 5; j++) {
            if(j == 3){
                break;
            }
            System.out.println(j);
        }

        System.out.println("I am out of the loop through break statement");

        //Keep entering numbers until the user enters multiple of 10
        //Scanner class is already used above
        
        do{
            System.out.print("Enter your number: ");
            int input = sc.nextInt();

            if(input % 10 == 0){
                break;
            }
            System.out.println(input);
        } while(true);

        // continue statement
        for(int x=1; x <= 5; x++){
            if( x == 3){
                continue;
            }
            System.out.println(x);
        }

        // Display all numbers entered by user except multiples of 10
        do {
            System.out.println("Enter number: ");
            int input2 = sc.nextInt();

            if( input2 % 10 == 0){
                continue;
            } 
            System.out.println("Number is: " + input2);
        } while(true);
    }
}
