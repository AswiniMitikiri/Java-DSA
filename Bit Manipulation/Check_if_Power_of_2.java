public class Check_if_Power_of_2 {

    public static boolean is_Power_of_2(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(is_Power_of_2(14));
    }
}