/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author The Red Setters
 */

@Path("/test")
public class Tester {
    
    // curl -vi -X GET -G "http://localhost:49000/api/test/hello"
    @GET
    @Path("/{param}")
    public Response testing(@PathParam("param") String message) {
        String output = "Testing, one, two, three:  " + message + "!";
        return Response.status(200).entity(output).build();
    }
}