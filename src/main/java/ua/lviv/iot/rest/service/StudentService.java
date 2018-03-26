package ua.lviv.iot.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ua.lviv.iot.model.Student;

@Path("/student")
public class StudentService {

    @GET
    @Path("{id}/")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Student getStudent(@PathParam("id") Integer id) {
        return new Student("uassa", "first");
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Student updateStudent(Student student) {
        System.out.println(student.getLastName());
        return student;
    }
}
