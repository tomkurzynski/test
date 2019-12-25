/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking.Resources;

import com.google.gson.Gson;
import com.mycompany.online_banking.Database.Databse;
import com.mycompany.online_banking.Model.Account;
import com.mycompany.online_banking.Services.TransactionService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Ryan
 */
@Path("/transactions")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TransactionResource {
    
    TransactionService tService = new TransactionService(); 
    private List<Account> accountList = Databse.getAccountList();
    
    //curl -v -X POST http://localhost:49000/api/2/lodgement/100
    @POST
    @Path("/{accId}/lodge/{amount}")
    @Produces(MediaType.APPLICATION_XML)  
    public Response lodgeMoney(@PathParam("accId") int id, @PathParam("amount") double amount){
        Gson gson = new Gson();
        tService.lodgeMoney(id, amount);
        String message = "Lodgement successful";
        return Response.status(Response.Status.CREATED).entity(message).build(); 
        
    }
    
    @POST
    @Path("/{accId}/withdraw/{amount}")
    @Produces(MediaType.APPLICATION_XML)  
    public Response withdrawMoney(@PathParam("accId") int id, @PathParam("amount") double amount){
        Gson gson = new Gson();
        double balance = accountList.get(id).getBalance();
        String message = "";
        if(balance >= amount){
            tService.withdrawMoney(id, amount);
            message = "Withdrawal successful";
        } else { 
            message = "You don't have sufficient funds in your account";
        }
            return Response.status(Response.Status.CREATED).entity(message).build(); 
        
    }
}
