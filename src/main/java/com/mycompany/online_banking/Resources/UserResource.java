/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking.Resources;
import com.mycompany.online_banking.Model.User;
import com.mycompany.online_banking.Model.Account;
import com.mycompany.online_banking.Model.Transaction;
import com.mycompany.online_banking.Services.AccountServices;
import com.mycompany.online_banking.Services.UserService;



import java.util.List;
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
public class UserResource {
    UserService userService = new UserService();
    
    //return users balance
    // curl -v -X POST http://localhost:49000/api/users/balance
   /*
    @GET
    @Path("/{balance}")
    @Produces(MediaType.APPLICATION_XML)  
    public Account getBalance(@PathParam("accountNum") int accountNum) {
        return AccountServices.getBalance();
    }
        //return users balance
    // curl -v -X POST http://localhost:49000/api/users/Users
*/
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_XML)
    public List<User> createUsers() {
        return userService.createAllUsers();
    }
    
}
