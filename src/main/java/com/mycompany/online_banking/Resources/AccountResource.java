/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking.Resources;
import com.mycompany.online_banking.Services.AccountServices;
import com.mycompany.online_banking.Model.Account;
import com.mycompany.online_banking.Model.User;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;




/**
 *
 * @author Ryan
 */

public class AccountResource {
    
    //User user = new User();
       
    AccountServices accountServices = new AccountServices();
    
    /*
    @GET
    @Path("/createAccount")
    @Produces(MediaType.APPLICATION_XML)
    public List<Account> createAccount() {
        return accountServices.createAccount();
    }
    */
    
}
/*
    @Path("/fetch/{userId}")
    @Produces(MediaType.APPLICATION_XML)  
    public User getUser(@PathParam("userId") int id) {
        return userService.getUser(id);
    }
*/