/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking.Services;

import com.mycompany.online_banking.Database.Databse;
import com.mycompany.online_banking.Model.User;
import com.mycompany.online_banking.Model.Account;
import com.mycompany.online_banking.Model.Transaction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryan
 */
public class UserService {
    
     Databse userDB = new Databse();
   
       
     public User getUserById(int userId) {
        return userDB.getUserById(userId);
    }
    
    public User createUser(User u){
        return userDB.createUser(u);
    }
        
       
        
       
    
    
    /*
    Customer cus1 = new Customer(1, "Enda","en@gmail.com","321654",ac1);
        customerDB.add(cus1);
        accountDB = ac1;
    */
    /*
   //return all users
    public List<Account> getUserAccounts(String accountNum) {
        return Account.getAccounts();        
    }
    
    // return a user
    public User getUser(int id) {
        return list.get(id-1);
    }
    */
    
}
