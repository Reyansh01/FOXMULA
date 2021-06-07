package tech.menerva.resource;

import tech.menerva.dto.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.LinkedHashMap;
import java.util.Map;

@Path("/student")
@Produces("application/json")
@Consumes("application/json")
public class StudentResource {

    private final Map<String, Student> studentMap=new LinkedHashMap<>();

    @POST
    @Path("/addStudent")
    public Response addStudent(Student student){
        if(studentMap.containsKey(student.getRollNo())){
            return Response.status(Response.Status.BAD_REQUEST).entity("Student Already Exist!").build();
        }else{
            studentMap.put(student.getRollNo(),student);
            return Response.ok(student).build();
        }
    }

    @GET
    @Path("/{rollNo}")
    public Response getStudent(@PathParam("rollNo") String rollNo){
        if(studentMap.containsKey(rollNo)){
            return Response.ok(studentMap.get(rollNo)).build();
        }else{
            return Response.status(404).entity("Student Not Found!").build();
        }
    }

    @PUT
    @Path("/updateStudent/{rollNo}")
    public Response updateStudent(@PathParam("rollNo") String rollNo,Student student){
        if(studentMap.containsKey(rollNo)){
            studentMap.put(rollNo,student);
            return Response.ok(student).build();
        }else{
            return Response.status(404).entity("Student Not Found!").build();
        }
    }
}