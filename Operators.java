public  class Operators {
    public static void main(String args[]){
        int A = 10;
        int B = 5;
        System.out.println("Addition = " + (A+B));
        System.out.println("Subtraction = " + (A-B));
        System.out.println("Multiplication = " + (A*B));
        System.out.println("Division = " + (A/B));
        System.out.println("Modulo = " + (A%B));

        //Unary Operators - Pre increment
        int c = 10;
        int d = ++c;
        System.out.println("\nPre-Increment Unary Operator");
        System.out.println(c);
        System.out.println(d);

        //Unary Operators - Post increment
        int e = 10;
        int f = e++;
        System.out.println("Post-Increment Unary Operator");
        System.out.println(e);
        System.out.println(f);

        //Unary Operators - Pre decrement
        int g = 10;
        int h = --g;
        System.out.println("Pre-decrement Unary Operator");
        System.out.println(g);
        System.out.println(h);

        //Unary Operators - Post decrement
        int i = 10;
        int j = i--;
        System.out.println("Post-decrement Unary Operator");
        System.out.println(i);
        System.out.println(j);

        //Relational Operator
        int a = 10;
        int b = 5;

        System.out.println("\nRelational Operators");
        System.out.println("a = 10 and b = 5");
        System.out.println("a == b => " + (a == b));
        System.out.println("a != b => " + (a != b));
        System.out.println("a > b => " + (a > b));
        System.out.println("a < b => " + (a < b));
        System.out.println("a >= b => " + (a >= b));
        System.out.println("a <= b => " + (a <= b));

        // Logical operator
        System.out.println("\n Logical Operators");
        System.out.println("AND Operator => (3 < 2) && (5 > 0)" );
        System.out.println((3 < 2) && (5 > 0));
        System.out.println("OR Operator => (3 < 2) && (5 > 0)" );
        System.out.println((3 < 2) || (5 < 0));
        System.out.println("LOGICAL NOT OPERATOR => (0 > 5)");
        System.out.println( !(0 > 5) );

        // Assignment operator
        System.out.println("\n Assignment Operators");

        int Num = 10;
        // Num = Num + 10;
        Num += 10;
        System.out.println(Num);

        int Num2 = 5;
        // Num2 = Num2 - 5;
        Num2 -= 5;
        // Num2 *= 5;
        // Num2 /= 5;
        System.out.println(Num2);

    }
    
}
