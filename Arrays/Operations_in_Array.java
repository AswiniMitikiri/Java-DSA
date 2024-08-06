import java.util.*;
public class Operations_in_Array {
    public static void main (String args[]){
        //Creating Arrays
        int marks[] = new int[50]; 
        // arrays are static type as the size once declared can't be changed during runtime
        // int numbers[] = {1,2,3};
        // int moreNumbers[] = {4,5,6};
        // String fruits[] = {"apple","orange","mango"};

        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();

        System.out.println("Length of array = " + marks.length);  //length of array

        marks[0] = sc.nextInt();   //phy
        marks[1] = sc.nextInt();   //chem
        marks[2] = sc.nextInt();   //maths

        System.out.println("Physics: " + marks[0]);   
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        // marks[2] = 100;    //Update the value
        // marks[2] = marks[2] + 1;
        // System.out.println("Math: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + "%");
        sc.close();

    }
}
