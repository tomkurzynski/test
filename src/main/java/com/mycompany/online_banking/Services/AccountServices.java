/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking.Services;
import com.mycompany.online_banking.Model.User;
import com.mycompany.online_banking.Model.Transaction;
import com.mycompany.online_banking.Model.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryan
 */
public class AccountServices {
    
    private List<Account> account = new ArrayList<>();
    public static List<Account> userOneAccount = new ArrayList<>();
    public static List<Account> userTwoAccount = new ArrayList<>();
    private List<Transaction> trans1 = new ArrayList<>();
    private List<Transaction> trans2 = new ArrayList<>();
    
    
    /*
    public double getBalance(int accountNum){
        
        
        return Account.getBalance();
    }
    */
    


    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    public static List<Account> getUserOneAccount() {
        return userOneAccount;
    }

    public static void setUserOneAccount(List<Account> userOneAccount) {
        AccountServices.userOneAccount = userOneAccount;
    }

    public static List<Account> getUserTwoAccount() {
        return userTwoAccount;
    }

    public static void setUserTwoAccount(List<Account> userTwoAccount) {
        AccountServices.userTwoAccount = userTwoAccount;
    }

    public List<Transaction> getTrans1() {
        return trans1;
    }

    public void setTrans1(List<Transaction> trans1) {
        this.trans1 = trans1;
    }

    public List<Transaction> getTrans2() {
        return trans2;
    }

    public void setTrans2(List<Transaction> trans2) {
        this.trans2 = trans2;
    }
    


}
