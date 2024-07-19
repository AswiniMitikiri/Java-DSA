import java.util.*;

public class JavaBasics {
    public static void main(String args[]){
        System.out.println("Hello Aswini!");
        System.out.print("Hello Aswini!\n");
        System.out.print("Hello Aswini!\n\n"); // we use back slash n to print in new line
        
        System.out.println("****");  //Print the pattern using println function
        System.out.println("***");
        System.out.println("**");
        System.out.println("*\n");
        
        int a =10;  // define variables
        int b=5;
        System.out.println("a");  // printing a string not th e variable
        System.out.println(a);
        String name = "Tony Stark"; // define string type variable
        System.out.println(name);

        a=50; //  to change the value of a variable
        System.out.println(a);

        // define the data types for the variables

        byte bt=8;
        System.out.println(bt);
        char ch='c';
        System.out.println(ch);
        boolean var=true;
        System.out.println(var);
        float price=10.5f;
        int number=25;
        //long
        //double
        short n= 240;

        //sum of 2 numbers
        int c=5;
        int d=10;
        int sum =c+d;
        System.out.println("\n"+sum);
    

        // Take input from user

        Scanner sc =new Scanner(System.in);
        /*
        String input= sc.next(); // takes only the first word till the space is given in a sentence is given
        System.out.println(input);
        */

        // String fullname=sc.nextLine();
        // System.out.println(fullname);

        int num= sc.nextInt();
        System.out.println(num);

        float cost= sc.nextFloat();
        System.out.println(cost);
    
    }
}

//boilerplate code
/*public class javaBasics{
    public static void main(String args[]){
    
    
    }
  } 
    
*/