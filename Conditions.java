import java.util.*;

public class Conditions {
    public static void main(String args[]){
      // else-if condition
        int age  = 22;
        if(age >= 18){
            System.out.println("adult : drive, vote");
        }
        else if(age > 13 && age < 18){
            System.out.println("Teenager");
        }
        else {
            System.out.println("Not adult");
        }

        // print largest of 2 numbers

        int A = 1;
        int B = 5;
        
        if ( A >= B){
          System.out.println("A is largest of 2");
        } else {
          System.out.println("B is largest of 2");
        }

        // Print if a number is even or odd
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0) {
          System.out.println("EVEN");
        } else {
          System.out.println("ODD");
        }

        // Income Yax Calculator
        int Income =  sc.nextInt();
        int tax = 0;
        if ( Income < 500000) {
          tax = 0;
        }
        else if (Income >= 500000 && Income <= 1000000){
          tax = (int) (Income * 0.2); // type casting is used
        }
        else {
          tax = (int) (Income * 0.3);
        }
        System.out.println("Your tax is: " + tax);

        // Print the largest of 3

        int a = 1;
        int b = 3;
        int c = 6;

        System.out.print("Largest number is: ");
        if((a >= b)  &&  (a >= c)){
          System.out.println(a);
        } else if (b >= c) {
          System.out.println(b);
        } else {
          System.out.println(c);
        }


        // Ternary Operator

        int num = 4;
        System.out.println("Cheching Ternary operator in the code");
        String type = ((num % 2) ==0) ? "even" : "odd";
        System.out.println(type);


        // Check if a Student is Pass or Fail using Ternary Operator
        int marks = 67;
        String reportcard = (marks >= 33) ?  "Pass" : "Fail";
        System.out.println(reportcard);

        // Switch Operator

        char ch = 'e';
        switch(ch){
          case 'd': System.out.println("Samosa");
                    break;
          case 'e': System.out.println("Burger");
                    break;
          case 'f': System.out.println("Pizza");
                    break;
          default: System.out.println("we wake up from dream");
        }
        //Calculator using Switch

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        char operator = sc.next().charAt(0);

        switch(operator) {
          case '+' : System.out.println(number1+number2);
                        break;
          case '-' : System.out.println(number1-number2);
                        break;
          case '*' : System.out.println(number1*number2);
                        break;
          case '/' : System.out.println(number1/number2);
                        break;
          case '%' : System.out.println(number1%number2);
                        break;
          default : System.out.println("Wrong operator");
        }

        //Print whether a number is Positive and Negative

        int integer = sc.nextInt();
        if(integer > 0) {
          System.out.println("Positive");
        }
        else {
          System.out.println("Negative");
        }

        // Print whether you have fever or not

        double temp = 103.5;
        if(temp > 100) {
          System.out.println("You have a fever");
        }
        else {
          System.out.println("You dont have a fever");
        }

        // Print day of a week name using Switch operator

        int week = sc.nextInt();
        switch (week){
          case 1:{
            System.out.println("Sunday");
          }
          break;
          case 2:{
            System.out.println("Monday");
          }
          break;
          case 3:{
            System.out.println("Tuesday");
          }
          break;
          case 4:{
            System.out.println("Wednesday");
          }
          break;
          case 5:{
            System.out.println("Thursday");
          }
          break;
          case 6:{
            System.out.println("Friday");
          }
          break;
          case 7:{
            System.out.println("Saturday");
          }
          break;
          default:
          System.out.println("Invalid Input! Please Enter a Week Number between 1 - 7");
        }

        //Print what will be the output of below code
        int p = 63, q = 36;
        boolean x = (p < q) ? true : false; 
        int y = (p > q) ? p : q;
        System.out.println(x);
        System.out.println(y);

        // Print whether the year is a leap year or not

        int year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0 && year % 400 == 0){
          System.out.println("Leap year");
        }
        else {
          System.out.println("Not a Leap year");
        }

        // Better way
        // int yearn = sc.nextInt();
        // boolean s = (yearn % 4) ==0;
        // boolean t= (yearn % 100) !=0;
        // boolean u= ((yearn % 100 == 0) && (yearn % 400 == 0));
        // if(s && (t || u)) {
        //   System.out.println(year+" is a leap year");
        // } else {
        //   System.out.println(year+" is not a leap year");
        // }
    }       
}
