import java.util.*;

public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Average of three numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println(avg);
        // Area of Square
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println(area);
        // Total Cost of items
        float pencilcost=sc.nextFloat();
        float pencost=sc.nextFloat();
        float erasercost=sc.nextFloat();
        float TotalCost = pencilcost + pencost + erasercost;
        float withgst = TotalCost + (0.18f * TotalCost);
        System.out.println(withgst);
        // Question number 4
        byte bt =4;
        char ch = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * bt) + (i % ch) - (d * s);
        System.out.println(result);

    }
    
}
