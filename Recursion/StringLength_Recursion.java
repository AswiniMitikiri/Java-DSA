public class StringLength_Recursion {
    public static int stringLength(String str) {
        // Base case: If the string is empty, return 0
        if (str.equals("")) {
            return 0;
        }
        // Recursive case: Return 1 plus the length of the substring (excluding the first character)
        return 1 + stringLength(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "Dedeepya";
        System.
        
        
        
        
        out.println(stringLength(str));  // Output: 8
    }
}
