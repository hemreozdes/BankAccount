/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ErrorManager;
/**
 *
 * @author hemre
 */
public class BankAccount {

    public static void main(String[] args) {
        AccountManager manager=new AccountManager();
        System.out.println("Account= "+manager.getBalance());
        manager.deposit(100);
        System.out.println("Account= "+manager.getBalance());
        try{
            manager.withdraw(90);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Account= "+manager.getBalance());
        try{
            manager.withdraw(90);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Account= "+manager.getBalance());
    }
}
