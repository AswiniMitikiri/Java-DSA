import java.util.*;
public class Strings{

    //user defined function to print all characters in String
    public static void printLetters(String str) {
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    //String Substring
    public static String subString(String substr, int si, int ei){
        String substr2 = "";
        for( int i =si; i<ei; i++){
            substr2 += substr.charAt(i);
        }
        return substr2;
    }
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        //Strings are immutable 

        //Strings as input
        Scanner sc = new Scanner(System.in);
        String name;
        //name = sc.next();  // takes only single word
        name = sc.nextLine();
        System.out.println(name);

        //String Length function
        String Name = "Tony Stark";
        System.out.println("length of Tony Stark is " + Name.length());

        //String Concatenation

        String firstName = "Aswini";
        String lastName = "Mitikiri";
        String fullName = firstName + " " + lastName;
        System.out.println("Concatenation of Strings: " + fullName);

        //String charAt Method
        System.out.println("character at first index" + fullName.charAt(0));
        //Print all character with user defined dfunction
        printLetters(fullName);

        //String Compare function
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        
        // Analyze the outputs of below codes
        // if(s1 == s2) {          // "==" checks if the objects of the variables are equal or not but not the value
        //     System.out.println("s1 and s2 Strings are equal");
        // } else {
        //     System.out.println("s1 and s2 Strings are not equal");
        // }

        // if(s1 == s3) {
        //     System.out.println("s1 and s3 Strings are equal");
        // } else {
        //     System.out.println("s1 and s3 Strings are not equal");
        // }

        //outputs
        //s1 and s2 Strings are equal
        //s1 and s3 Strings are not equal

        //to check the values we use equals function -> equals function returns a boolean value
        if(s1.equals(s3)){
            System.out.println("s1 and s3 are equal using equals function");
        } else {
            System.out.println("s1 and s3 are not equal");
        }

        //SubString
        String substr = "Hello World";
        System.out.println(subString(substr, 0, 5));
    }
}