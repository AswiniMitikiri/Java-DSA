public class clearRangeofBits {

    public static int clear_Range_of_Bits(int n , int i, int j){
        int a = ((~0) << j+1);
        int b = (1 << i) - 1;
        int bitmask = a|b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clear_Range_of_Bits(10, 2, 7));
    }
}
