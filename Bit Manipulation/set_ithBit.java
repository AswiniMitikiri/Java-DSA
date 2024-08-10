public class set_ithBit {
    public static int set_ith_Bit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }
    
    public static void main(String[] args) {
        System.out.println(set_ith_Bit(10,2));
    }

}
