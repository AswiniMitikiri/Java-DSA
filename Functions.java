import java.util.Scanner;

public class Functions {

    //Functions

    public static void PrintHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }


    // public static int PrintHelloWorld() {
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     return 3;    //this method should return some integer as we have taken int type while defining the function
    // }


    //Syntax with parameter example
    public static int Calculatesum(int num1, int num2) {   //Parameters or formal Parameters
        
        int sum = num1 + num2;
        return sum;
        
    }
    //Function to Swap of 2 numbers
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapping of a and b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // Function to find product of 2 numbers 
    public static int multiply(int x, int y) {
        int product = x * y;
        return product;
    }

    //Function to find factorial of a number
    public static int Factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    //Function to find Binomial Coefficient nCr = n!/(r! * (n-1)!)
    public static int BinCoeff(int n, int r){
        int n_fact = Factorial(n);
        int r_fact = Factorial(r);
        int n_r_fact = Factorial(n-r);
        System.out.println("Binomial Coefficient of " + n + " and " + r);
        int binCoeff = n_fact/(r_fact * n_r_fact) ;
        return binCoeff;
    }




    // Function Overloading using parameters

    // Function to calc sum of 2 numbers
    public static int sum1(int number1, int number2) {
        return number1 + number2;
    }
    // Function to calc sum of 3 numbers
    public static int sum1(int number1, int number2, int number3){
        return number1 + number2 + number3;
    }

    // Function overloading using datatypes
    public static int sum2(int num_1, int num_2)  {
        return num_1 + num_2;
    }

    public static float sum2(float num_1, float num_2) {
        return num_1 + num_2;
    }


    // Check Prime(Optimised)

    public static boolean isPrime(int p) {
        //System.out.println("Is " + p + " a prime ? ");
        if( p == 2) {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(p); i++){
            if(p % i == 0){
                return false;
            } 
        }

        return true;
    }

    // Print all Primes in Range

    public static void primesInRange(int n) {
        for( int i = 2; i <= n; i++ ){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    // Function to convert Binary to Decimal
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum= decNum + (lastDigit * (int)Math.pow(2, pow)); 
            // inbuilt power value is double. so we need to convert it into integer
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal NUmber of " + myNum + " = " + decNum);
    }



    // To Convert Decimal to Binary Number
        public static void decToBin(int decNum) {
            int myDecNum = decNum;
            int pow = 0;
            int binNum = 0;

            while( decNum > 0){
                int rem = decNum % 2;
                binNum = binNum + (rem * (int)Math.pow(10, pow));
                pow++;
                decNum = decNum/2;
            }
            System.out.println("Binary Number of " + myDecNum + " is " + binNum);
        }

    //Practice questions

    //Write a Java method to compute the averageof three numbers..

    public static float CalculateAverage(int i, int j, int k){
        float Average = (float)(i + j + k)/3;
        return Average;
    }

    //Write a method named isEven that accepts an int argument.
    //The method should return true if the argument is even, or false otherwise.
    //Also write a program to test your method.
    public static boolean isEven(int integer) {
        
        System.out.println("Is the num Even Or Odd ");
        return integer % 2 == 0;
    }

    public static void Palindrome(int pal){
        int myPalindrome = pal;
        int rem = 0;
        int reverse = 0;
        while(pal > 0){
            rem = pal % 10;
            reverse = rem + reverse * 10;
            pal = pal / 10;
        }

        if(myPalindrome == reverse){
            System.out.println(myPalindrome + " is a Palindrome");
        }
        else {
            System.out.println(myPalindrome + " is not a Palindrome");
        }
    }


    // write a java code to compute sum of the digits in an integer

    public static int SumofDigits(int S){
        int sum = 0;
        while(S>0){
            int rem = S % 10;
            sum = sum + rem;
            S = S/10;
        }
        return sum;
    }


    public static void main(String args[]) {
        PrintHelloWorld(); //Function call

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum_a_b = Calculatesum(a, b); // Arguments or actual parameters -> the values that are passed in the function call are called arguments

        // System.out.println("Sum is:" + sum_a_b);


        //swap - values exchange
        int a = 5;
        int b = 10;
        swap(a,b);
        System.out.println("printing a and b values in main method does not follow swap function operations");
        System.out.println("a = " + a);
        System.out.println("b = " + b);  
    //  the values of a and b in the main method are directly taken from the main method 
    // as the scope of the "print" function will be within main method and 
    //  so a and b values will only be modified in the swap function

        int x = sc.nextInt();
        int y = sc.nextInt();
        int prod = multiply(x , y);
        System.out.println("Product of " + x + " and " + y );
        System.out.println(x + " * " + y + " = " + prod);

        // check factorial
        int n1 = sc.nextInt();
        System.out.println("Factorial of " + n1 + " is " + Factorial(n1));

        //check Binomial Coefficient
        System.out.println(BinCoeff(5, 2));

        // Function Overloading
        System.out.println("Function Overloading example using parameters");
        System.out.println("Sum of 2 numbers " + sum1(2,3));
        System.out.println("Sum of 3 numbers " + sum1(4,3,5));

        System.out.println("Function Overloading example using datatypes");
        System.out.println("Sum of 2 integer numbers " + sum2(2,3));
        System.out.println("Sum of 2 decimal numbers " + sum2(4.7f,3.3f));

        System.out.println(isPrime(16));

        // to print primes in range
        primesInRange(20); //2 to 20

        System.out.println();
        // To print binary value of Decimal Number
        binToDec(101);
        decToBin(12);





        
        // Practice Questions main methods

        //Average of 3 numbers
        System.out.println("Average of 3 numbers " + CalculateAverage(3,5,2));

        // Print if number is Even or Odd
        int numberEorO = sc.nextInt();
        boolean result = isEven(numberEorO);
        System.out.println(result);

        // check if a number is Palindrom or not

        int palin = sc.nextInt();
        Palindrome(palin);

        //Sum of the digits
        int S = sc.nextInt();
        System.out.println(SumofDigits(S));

    }
}
