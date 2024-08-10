public class clear_ithBit {
    public static int clear_ith_Bit(int n, int i){
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clear_ith_Bit(10, 1));
    }
}