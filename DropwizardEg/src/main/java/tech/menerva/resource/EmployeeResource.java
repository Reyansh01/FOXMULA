package tech.menerva.resource;

import tech.menerva.dto.Employee;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.LinkedHashMap;
import java.util.Map;

@Path("/employee")
@Produces("application/json")
@Consumes("application/json")
public class EmployeeResource {

    private final Map<String, Employee> employeeMap = new LinkedHashMap<>();

    @POST
    @Path("/addEmployee")
    public Response addEmployee(Employee employee) {
        if(employeeMap.containsKey(employee.getEmployeeID())) {
            return Response.status(Response.Status.BAD_REQUEST).entity("Employee Already Exist!!").build();
        }
        else {
            employeeMap.put(employee.getEmployeeID(), employee);
            return Response.ok(employee).build();
        }
    }

    @GET
    @Path("/{employeeID}")
    public Response getEmployee(@PathParam("employeeID") String employeeID) {
        if(employeeMap.containsKey(employeeID)) {
            return Response.ok(employeeMap.get(employeeID)).build();
        }
        else {
            return Response.status(404).entity("Employee Not Found!").build();
        }
    }

    @PUT
    @Path("/updateEmployee/{employeeID}")
    public Response updateEmployee(@PathParam("employeeID") String employeeID, Employee employee) {
        if(employeeMap.containsKey(employeeID)) {
            employeeMap.put(employeeID, employee);
            return Response.ok(employee).build();
        }
        else {
            return Response.status(404).entity("Employee Not Found!").build();
        }
    }
}