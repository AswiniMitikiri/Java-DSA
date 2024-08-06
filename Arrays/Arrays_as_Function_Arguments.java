public class Arrays_as_Function_Arguments {
    public static void update(int marks[], int nonchangeble){
        nonchangeble = 10;
        for(int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]){
        int marks[] = {97,98,99};
        int nonchangeble = 5;     // does not update from the update function as integers are call by value
        update(marks, nonchangeble);

        System.out.println("integer value " + nonchangeble);

        //print our marks

        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        // updated values will be printed as the arrays are called by reference 
        // that means the changes reflect in main function as well
    }
}
