/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking.Services;

import com.mycompany.online_banking.Database.Databse;
import com.mycompany.online_banking.Model.Account;
import java.util.List;

/**
 *
 * @author Ryan
 */
public class TransactionService {
    
    private List<Account> accountList = Databse.getAccountList();
    //lodge (accID,amount)
    public void lodgeMoney(int accId, double amount) {
        double newBalance = accountList.get(accId-1).getBalance() + amount;
        accountList.get(accId-1).setBalance(newBalance);
    }
    
    //withdraw (amount)
     public void withdrawMoney(int accId, double amount) {
        double newBalance = accountList.get(accId-1).getBalance()- amount;
        accountList.get(accId-1).setBalance(newBalance);
    }
    
    //transfer (accId1, accId2, amount) Patf /accFrom/accTo
}
