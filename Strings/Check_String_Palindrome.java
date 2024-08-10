public class Check_String_Palindrome{  ///Time Complexity -> O(n) linear time complexity

    public static boolean isPalindrome(String str){
        for(int i = 0; i < str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}