public class Update_ithBit {
    
    public static int clear_ithBit(int n, int i){
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int set_ithBit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int update_ithBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clear_ithBit(n, i);
        // }
        // else {
        //     return set_ithBit(n, i);
        // }

        n = clear_ithBit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;

    }
    
    public static void main(String[] args) {
        System.out.println(update_ithBit(10, 2, 1));
    }
}