package com.sanlea.study;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello1() {
        return "Hello RESTEasy";
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2() {
        return "Hello RESTEasy";
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello3() {
        return "Hello RESTEasy";
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello4() {
        return "Hello RESTEasy";
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello5() {
        return "Hello RESTEasy";
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello6() {
        return "Hello RESTEasy";
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello7() {
        return "Hello RESTEasy";
    }
}