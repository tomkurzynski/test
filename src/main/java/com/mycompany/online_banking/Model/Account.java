/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.mycompany.online_banking.Model.User;

/**
 *
 * @author The Red Setters
 */

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Account {
    private int sortCode;
    private int balance;
    private String accountNum;
    private List<Transaction> transactions;
    
    public Account(){
        
    }

    public Account(int sortCode, int balance, String accountNum, List<Transaction> transactions) {
        this.sortCode = sortCode;
        this.balance = balance;
        this.accountNum =  accountNum;
        this.transactions = transactions;
        
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

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }
    
    
    
    

    
}
