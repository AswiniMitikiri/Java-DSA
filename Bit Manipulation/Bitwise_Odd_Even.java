public class Bitwise_Odd_Even {

    public static void OddorEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            //even number
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        OddorEven(3);
        OddorEven(11);
        OddorEven(14);
    }
}