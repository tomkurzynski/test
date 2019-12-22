/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking.Services;
import com.mycompany.online_banking.Model.User;
import com.mycompany.online_banking.Model.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryan
 */
public class AccountServices {
    
    private List<Account> account = new ArrayList<>();
    public static List<Account> accountList = new ArrayList<>();
    
    /*
    public double getBalance(int accountNum){
        
        
        return Account.getBalance();
    }
    */
  
    public List<Account> createAccount() {

        //initialise accounts
       Account account1 = new Account(123,5000,"A123");
       Account account2 = new Account(321,1000,"B123");
       

       accountList.add(account1);
       accountList.add(account2);
        
        return accountList;
        
       
    }
    
}
