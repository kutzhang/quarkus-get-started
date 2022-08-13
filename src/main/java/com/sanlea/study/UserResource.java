package com.sanlea.study;

import com.sanlea.study.vo.UserVO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/user")
public class UserResource {

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public UserVO fetchDetail(@PathParam("id") String id) {
        return UserVO.builder()
                .id(id)
                .name(UUID.randomUUID().toString())
                .age(24)
                .build();
    }

    @Path("/magic")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String magic() {
        return "magic";
    }
}
