
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account matt = new Account("Matt's account", 1000);
        Account my_account = new Account("My account", 0);
        
        matt.withdrawal(100);
        my_account.deposit(100);
        
        System.out.println(matt.toString());
        System.out.println(my_account.toString());

    }

}
