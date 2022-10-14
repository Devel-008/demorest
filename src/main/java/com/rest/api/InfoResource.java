package com.rest.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;



@Path("info")
public class InfoResource {
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Info getInfo(){
        System.out.println("CALLING");
        Info info = new Info();
        info.setId(1L);
        info.setName("Jasiii");
        info.setMessage("Hello World");
        return info;
    }
}
