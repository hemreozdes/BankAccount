/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ErrorManager;
/**
 *
 * @author hemre
 */
public class AccountManager {
    private double balance;
    public void deposit(double amount){
        balance=getBalance()+amount;
    }
    public void withdraw(double amount)throws Exception{
        if(balance>=amount){
            balance=getBalance()-amount;
        }
        else{
            throw new Exception("Balance is not enough!");
        }
    }

    public double getBalance(){
        return balance;
    }
}
