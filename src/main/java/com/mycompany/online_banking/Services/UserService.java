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
    
    public static List<User> list = new ArrayList<>();
    
    public List<User> createAllUsers() {
        User user1 = new User("John", "Dublin", "john@gmail.com","password");
        User user2 = new User("Mark", "Dublin", "mark@gmail.com","password");
       

        list.add(user1);
        list.add(user2);
        return list;
       
    }
    
   
    
    public User getUser(int id) {
        return list.get(id-1);
    }
    
}
