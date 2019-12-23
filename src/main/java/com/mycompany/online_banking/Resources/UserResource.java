/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking.Resources;
import com.mycompany.online_banking.Database.Databse;
import com.mycompany.online_banking.Model.User;
import com.mycompany.online_banking.Model.Account;
import com.mycompany.online_banking.Model.Transaction;
import com.mycompany.online_banking.Services.AccountServices;
import com.mycompany.online_banking.Services.UserService;



import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 *
 * @author Ryan
 */
@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    UserService userService = new UserService();
    Databse userDB = new Databse();
    

     // curl -v -X POST http://localhost:49000/api/users/fetch/1 
  
    @GET
    @Path("/fetch/{userId}")
    @Produces(MediaType.APPLICATION_XML)
    public User userById(@PathParam("userId")int userId){
        System.out.println("Fetching User information...");
        return userService.getUserById(userId);
    }
    
       // curl -v -X POST http://localhost:49000/api/users/fetch/1
    /*
    @POST
    @Path("/createCustomer")
    public User createUser(User u){
        System.out.println("Creating new User...");
        return userService.createUser(u);
    }
    */
   

    
}
