/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author The Red Setters
 */
public class Account {
    private int sortCode;
    private int balance;
    private String accountNum;
    private Transaction [] transArray;
    //private List<Integer> transList = new ArrayList<Integer>();
    
    // create a list of transactions??
    private List<Transaction> transList = Arrays.asList(transArray);
    

    public Account(int sortCode, int balance, String accountNum,List<Transaction> transList) {
        this.sortCode = sortCode;
        this.balance = balance;
        this.accountNum = accountNum;
        this.transList= transList;
    }

    public int getSortCode() {
        return sortCode;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }
    
    
    
    

    
}
