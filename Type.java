import java.util.*;

public class Type {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int a = 25;
        // float b = a;  
        
        // float a = 25.12; 
        // int b = a;             
        /*This Type conversion is not possible since
         float data type is larger than int */
        
        float a = 25.9999999f; 
        int b = (int) a;  
        // Thi s is Type casting but this doesn't round of to 26.
        
        System.out.println(b);

        char ch = 'a';
        int number = ch;
        System.out.println(number); 
        // prints the ASCII values of he characters


        // Type Promotion
        char num1 = 'a';
        char num2 = 'b';
        char c = num2-num1;  // gives an error as we can not convert int to char
        System.out.println((int)(num1));
        System.out.println((int)(num2));
        System.out.println(num2-num1);  
        //Type conversion only happen in expression
        System.out.println(num1);

        // short a = 25;
        // byte b = 25;
        // char c = 'c';
        // byte bt = a + b + c; // gives an error as int can not be converted into byte
        // byte bt = (byte)(a+b+c); // gives a value in bytes as type casting is used
        // System.out.println(bt);
    }
 
}
