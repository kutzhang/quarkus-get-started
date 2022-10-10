package com.sanlea.study;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class GreetingResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Path("/show_me_the_money")
    @Produces(MediaType.TEXT_PLAIN)
    public String showMeTheMoney() {
        return "Show me the money";
    }
}