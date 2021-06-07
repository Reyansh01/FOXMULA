package tech.menerva.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")

public class HelloResource {

    @GET
    @Path("/test")
    public Response test(){
        return Response.ok("Hello World").build();
    }


    @GET
    @Path("/calcFactorial/{number}")
    public  Response factorial(@PathParam("number") String number){
        int num=Integer.parseInt(number);
        int fact=1;
        for(int i=2;i<=num;i++){
            fact=fact*i;
        }
        return Response.ok(fact).build();



    }

    @GET
    @Path("/calcFactorial1")
    public  Response calcFactorial(@QueryParam("number")@DefaultValue("5") String number){
        int num=Integer.parseInt(number);
        int fact=1;
        for(int i=2;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        return Response.ok(fact).build();

    }



}
