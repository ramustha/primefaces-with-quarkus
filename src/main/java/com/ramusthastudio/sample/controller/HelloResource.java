package com.ramusthastudio.sample.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloResource {

    @GET
    @Path("/quarkus")
    public String sayHello() {
        return "Hello from Quarkus";
    }
}
