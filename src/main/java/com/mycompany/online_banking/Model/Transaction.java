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
    private double input;

    public Transaction(String date, String description, double newBalance) {
        this.date = date;
        this.description = description;
        this.newBalance = newBalance;
    }
    
    
    public double updateBalance(double input, double balance){
        
        
    }
    
    
}
