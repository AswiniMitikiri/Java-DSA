public class Convert_toUppercase {

    //convert each first letter of each word to Uppercase
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch =Character.toUpperCase(str.charAt(0));
        sb.append(ch);


        //Time Complexity -> O(n)
        for(int i =1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }

            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am aswini";
        String str2 = "hello world";
        System.out.println(toUpperCase(str));
        System.out.println(toUpperCase(str2));
    }
}