public class Patterns2{

    // * * * * *
    // *       *
    // *       *
    // * * * * *
    public static void hollow_rectangle(int totalRows, int totalColumns){
        //outer loop
        System.out.println("\nHollow Rectangle");
        for(int i = 1; i <= totalRows; i++) {
            //inner loop
            for(int j = 1; j <= totalColumns; j++) {
                //cell - (i,j)
                if( i== 1 || i == totalRows || j == 1 || j == totalColumns) {
                    System.out.print("* "); // extra space for proper visibility
                } else {
                    System.out.print("  "); //extra space for proper visibility
                }
            }
            System.out.println();
        }
    }

//         *
//       * *
//     * * *
//   * * * *
// * * * * *
    public static void inverted_rotated_half_pyramid(int n){
        //outer loop
        System.out.println("\nInverted Rotated Half Pyramid");
        for(int i = 1; i <= n; i++) {
            //spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            //Stars
            for(int j = 1; j <= i; j++) { // try out with j <= n to find different pattern(Rhombus)
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1

    public static void inverted_half_pyramid_withNumbers(int n) {
        //outer loop
        System.out.println("\nInverted Half Pyramid With NUmbers");
        for(int i = 1; i <= n; i++) {
            //numbers
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void FLOYDS_Triangle(int n) {
        //outer loop
        int counter = 1;
        System.out.println("\nFLOYDS Triangle");
        for(int i = 1; i <= n; i++) {
            //inner loop for numbers
            for( int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1

    public static void zero_one_triangle(int n) {
        System.out.println("\nZERO-ONE Pyramid");
        //outer loop
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if( (i+j) % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // *             *
    // * *         * *
    // * * *     * * *
    // * * * * * * * *
    // * * * * * * * *
    // * * *     * * *
    // * *         * *
    // *             *

    public static void butterfly(int n){
        System.out.println("\nButterfly Pattern");
        //First half pattern
        for(int i = 1; i <= n; i++){
            //stars = i
            for(int j=1; j <= i; j++){
                System.out.print("* ");
            }
            //Spaces = 2 * (n-i)
            for(int j=1; j <= 2 * (n-i); j++){
                System.out.print("  ");
            }

            //stars = i
            for(int j=1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        //2nd Half Pattern
        for(int i = n; i >= 1; i--){
            //stars = i
            for(int j=1; j <= i; j++){
                System.out.print("* ");
            }
            //Spaces = 2 * (n-i)
            for(int j=1; j <= 2 * (n-i); j++){
                System.out.print("  ");
            }

            //stars = i
            for(int j=1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    //         * * * * *
    //       * * * * *
    //     * * * * *
    //   * * * * *
    // * * * * *

    public static void Solid_Rhombus(int n){
        System.out.println("\nSolid Rhombus");
        for(int i = 1; i <= n; i++){
            for(int j =1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j =1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
    
    //          * * * * *
    //        *       *
    //      *       *
    //    *       *
    //  * * * * *

    public static void Hollow_Rhombus(int n){
        System.out.println("\nHollow Rhombus");
        //outer loop
        for(int i = 1; i <= n; i++){
            //Spaces -> n-i
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            //Hallow Rectangle
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    //Diamond Pattern
    //       *
    //     * * *
    //   * * * * *
    // * * * * * * *
    // * * * * * * *
    //   * * * * *
    //     * * *
    //       *

    public static void Diamond(int n) {
        System.out.println("\nDiamond Pattern");
        //1st half
        //outer loop
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd half
        for(int i = n; i >= 1; i--){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
    public static void main(String args[]){
        hollow_rectangle(4,5);
        inverted_rotated_half_pyramid(5);
        inverted_half_pyramid_withNumbers(5);
        FLOYDS_Triangle(5);
        zero_one_triangle(5);
        butterfly(5);
        Solid_Rhombus(5);
        Hollow_Rhombus(5);
        Diamond(5);
    }
}
