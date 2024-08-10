public class AccessModifiers {

    public static void main(String[] args){
        BankAccount myAccount = new BankAccount();
        
        myAccount.username = "Aswini Mitikiri";
        //myAccount.password = "abc";  
        //gives error as password in private.
        //so it can't be accessed by other classes.


        myAccount.setPassword("abc");
        // here, we can not access password but we can change it using public function
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }

}