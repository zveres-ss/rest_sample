package ua.lviv.iot;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/student")
public class StudentService {

    @GET
    @Produces("application/json")
    public Student getStudent(Integer id) {
        return new Student("uassa", "first");
    }
}
