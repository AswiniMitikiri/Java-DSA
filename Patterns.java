public class Patterns {
    public static void main(String args[]){
        // *
        // **
        // ***
        // ****
        System.out.println("\nStar Pattern\n");
        for(int line = 1; line <= 4; line++){
            for(int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\nInverted Star Pattern\n");
        // ****
        // ***
        // **
        // *
        int n = 4;
        for(int line = 1; line <= n; line++) {
            for(int star = 1; star <= n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Print Half Pyramid pattern
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        System.out.println("\nPrint Half Pyramid Pattern\n");
        for(int line = 1; line <= 4; line++){
            for(int number = 1; number <= line; number++){
                System.out.print(number);
            }
            System.out.println();
        }

        // A
        // B C
        // D E F
        // G H I J
        // Print Character Pattern
        System.out.println("\nPrint Charater Pattern\n");
        char ch = 'A';
        //outer loop
        for(int i = 1; i <= 4; i++){
            //inner loop
            for(int j = 1; j <=i; j++){
                
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
