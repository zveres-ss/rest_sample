package ua.lviv.iot.rest.service;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ua.lviv.iot.model.Student;
import ua.lviv.iot.persistence.dao.StudentDao;

@Path("/students")
@SessionScoped
public class StudentService implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private StudentDao dao;

    @GET
    @Path("{id}/")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Student getStudent(@PathParam("id") Integer id) {
        return dao.findById(id);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Student updateStudent(Student student) {
        System.out.println(student.getLastName());
        return student;
    }
    
    @PUT
    public Response createStudent(Student student) {
        dao.persist(student);
        return Response.ok().build();
    }
    
}
