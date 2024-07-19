import java.util.*;

public class Area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
// java automatically takes all decimal values as double
// So we need to put "f" after writing a direct decimal value

        float area = 3.14f * r * r; 
        System.out.println(area);
    }
}
