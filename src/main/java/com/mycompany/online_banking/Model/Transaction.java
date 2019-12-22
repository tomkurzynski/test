/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking.Model;

/**
 *
 * @author Ryan
 */
public class Transaction {
    private String date;
    private String description;
    private double newBalance;
    private String debit_credit;
    private int transID;

    public Transaction(String date, String description, double newBalance, String debit_credit) {
        this.date = date;
        this.description = description;
        this.newBalance = newBalance;
        this.debit_credit = debit_credit;
    }
    
    
   
    
    
}
