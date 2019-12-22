/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking.Services;

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
    //create a list of users & a list of accounts
    public static List<User> userList = new ArrayList<>();
    public static List<Account> accountList = AccountServices.getAccountList();
    
    
    public List<User> createAllUsers() {
        //initialise users
        User user1 = new User("John", "Dublin", "john@gmail.com","password",1);
        User user2 = new User("Mark", "Dublin", "mark@gmail.com","password",2);
        //initialise accounts
       //Account account1 = new Account(123,5000,"A123");
       //Account account2 = new Account(321,1000,"B123");
       
        //Account [] accountUser1 = {account1, account2};
        //user1.setAccounts(accountUser1);
        userList.add(user1);
        userList.add(user2);
        //accountList.add(account1);
       // accountList.add(account2);
        
        return userList;
       
        
       
    }
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
